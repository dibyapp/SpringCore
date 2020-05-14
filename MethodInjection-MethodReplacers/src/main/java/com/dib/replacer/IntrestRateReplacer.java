package com.dib.replacer;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

import lombok.Setter;

@Setter
public class IntrestRateReplacer implements MethodReplacer {

	private float rate;
	
	
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("IntrestRateReplacer.reimplement() ---->> New Logic");
		System.out.println(obj.getClass()+" "+method.getName()+" "+Arrays.deepToString(args));
		float amt=0.0f;
		float time=0.0f;
		
		amt=(float)args[0];
		time=(float)args[1];
		
		return (amt*rate*time)/100.0f;
	}

}
