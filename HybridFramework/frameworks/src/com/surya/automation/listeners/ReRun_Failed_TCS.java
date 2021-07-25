package com.surya.automation.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.sun.net.httpserver.Authenticator.Result;

public class ReRun_Failed_TCS implements IRetryAnalyzer
{
    int retryCount=0;
    int maxRetryCount=4;
	@Override
	public boolean retry(ITestResult result) {
		 
		if (ITestResult.FAILURE == result.getStatus()&&retryCount<=maxRetryCount) {
			
			try {
                 Thread.sleep(3000);
                 System.out.println("count is: "+retryCount+"Executing TC: "+result.getName());
                 retryCount++;			
			     return true;
			}
			catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		return false;
	}
}
