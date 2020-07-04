package com.dib.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ArroundLoggingAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retVal = null;
		System.out.println("Entering into :"+invocation.getMethod().getName()+" with args "+Arrays.deepToString(invocation.getArguments()));
		retVal = invocation.proceed();
		System.out.println("Exiting from :"+invocation.getMethod().getName()+" with args "+Arrays.deepToString(invocation.getArguments()));
		return retVal;
	}
	
}
