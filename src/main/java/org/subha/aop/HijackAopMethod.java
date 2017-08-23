package org.subha.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class HijackAopMethod implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		System.out.println("**********Same as Before Method**********");
		
		System.out.println("Method name : "
				+ invocation.getMethod().getName());
		System.out.println("Method arguments : "
				+ Arrays.toString(invocation.getArguments()));
		
		try {
			
			invocation.proceed();
			System.out.println("**********Same as After Method without Exception**********");
			
		} catch (Exception e) {
			
			System.out.println("**********Same as After Throwing Advice**********");
		}
		
		
		System.out.println("**********Same as After Method**********");
		return null;
	}

}
