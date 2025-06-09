package com.unity.utilities;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class EmailReporting {
	public static void main(String[] args) {

//		// Create object of Property file
//		Properties props = new Properties();
//
//		// this will set host of server- you can change based on your requirement 
//		props.put("mail.smtp.host", "SMARTHOST.FISGLOBAL.COM");
//
//		// set the port of socket factory 
//		props.put("mail.smtp.socketFactory.port", "22");
//
//		// set socket factory
//		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
//
//		// set the authentication to true
//		props.put("mail.smtp.auth", "true");
//
//		// set the port of SMTP server
//		props.put("mail.smtp.port", "25");
//
//		// This will handle the complete authentication
//		Session session = Session.getDefaultInstance(props,
//
//				new javax.mail.Authenticator() {
//
//					protected PasswordAuthentication getPasswordAuthentication() {
//
//					return new PasswordAuthentication("shilpa.khare@fisglobal.com", "Spectrum@0211sK");
//
//					}
//
//				});
//
//		try {
//
//			// Create object of MimeMessage class
//			Message message = new MimeMessage(session);
//
//			// Set the from address
//			message.setFrom(new InternetAddress("shilpa.khare@fisglobal.com"));
//
//			// Set the recipient address
//			message.addRecipient(Message.RecipientType.TO, "shilpa.khare@fisglobal.com");
//			//message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(""));
//            
//                        // Add the subject link
//			message.setSubject("Testing Email Reporting");
//
//			// Create object to add multimedia type content
//			BodyPart messageBodyPart1 = new MimeBodyPart();
//
//			// Set the body of email
//			messageBodyPart1.setText("This is message body");
//
////			// Create another object to add another content
////			MimeBodyPart messageBodyPart2 = new MimeBodyPart();
////
////			// Mention the file which you want to send
////			String filename = "C:\\Projects\\LatestWorkSpace\\[Dec2021Latest]\\report\\SparkReport.HTML";
////
////			// Create data source and pass the filename
////			DataSource source = new FileDataSource(filename);
////
////			// set the handler
////			messageBodyPart2.setDataHandler(new DataHandler(source));
////
////			// set the file
////			messageBodyPart2.setFileName(filename);
////
//			// Create object of MimeMultipart class
//			Multipart multipart = new MimeMultipart();
////
////			// add body part 1
////			multipart.addBodyPart(messageBodyPart2);
////
//			// add body part 2
//			multipart.addBodyPart(messageBodyPart1);
//
//			// set the content
//			message.setContent(multipart);
//
//			// finally send the email
//			Transport.send(message);
//
//			System.out.println("=====Email Sent=====");
//
//		} catch (MessagingException e) {
//
//			throw new RuntimeException(e);
//
//		}
		

   
		      // Recipient's email ID needs to be mentioned.
		      String to = "Shilpa.Khare@fisglobal.com";

		      // Sender's email ID needs to be mentioned
		      String from = "Shilpa.Khare@fisglobal.com";

		      // Assuming you are sending email from localhost
		      //String host = "localhost";
		      String host = "SMARTHOST.FISGLOBAL.COM";

		      // Get system properties
		      Properties properties = System.getProperties();

		      // Setup mail server
		      properties.setProperty("mail.smtp.host", host);
		      properties.setProperty("mail.smtp.port", "25");
		      properties.setProperty("mail.user", "Shilpa.Khare@fisglobal.com");
		      properties.setProperty("mail.password", "Spectrum@1701sK");

		      // Get the default Session object.
		      Session session = Session.getDefaultInstance(properties);

		      try {
		         // Create a default MimeMessage object.
		         MimeMessage message = new MimeMessage(session);

		         // Set From: header field of the header.
		         message.setFrom(new InternetAddress(from));

		         // Set To: header field of the header.
		         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

		         // Set Subject: header field
		         message.setSubject("This is the Subject Line!");

		         // Now set the actual message
		         message.setText("This is actual message");

		         // Send message
		         Transport.send(message);
		         System.out.println("Sent message successfully....");
		      } 
		      catch (javax.mail.SendFailedException e) {
		    	  System.out.println( e.getInvalidAddresses());
		    	  e.printStackTrace();
		      }
		      catch (MessagingException mex) {
		         mex.printStackTrace();
		      }


	}

}