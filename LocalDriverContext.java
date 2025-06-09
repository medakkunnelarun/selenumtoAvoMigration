package com.unity.browsers;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.unity.constants.AppConstants;

public class LocalDriverContext {

	private LocalDriverContext() {
		throw new IllegalStateException("Driver Class");
	}

	private static Map<Integer, WebDriver> driverMap = new HashMap<>();
	private static int ThreadCount;

	/**
	 * This method provides a thread safe instance of the driver object
	 * 
	 * @author e5562312 neerajM
	 */
	public static WebDriver getDriver() {
		//System.out.println("Thread count get: "+(int) (Thread.currentThread().getId()));
		//return driverMap.get((int) (Thread.currentThread().getId()));
		if (AppConstants.APPLICATION_Type.equals("unity")) {
			return driverMap.get(ThreadCount);
		}else {
			return driverMap.get((int) (Thread.currentThread().getId()));
		}
		
	}

	/**
	 * This method stores the driver object which is initialized by current thread
	 * to be accessed later in thread-safe way
	 * 
	 * @author e5562312 neerajM
	 */
	public static void setDriver(WebDriver driver) {
		driverMap.put((int) (Thread.currentThread().getId()), driver);
		ThreadCount = (int) (Thread.currentThread().getId());
		//System.out.println("Thread count: "+(int) (Thread.currentThread().getId()));
		//System.out.println("Driver Map count :"+ driverMap.size());
	}
}
