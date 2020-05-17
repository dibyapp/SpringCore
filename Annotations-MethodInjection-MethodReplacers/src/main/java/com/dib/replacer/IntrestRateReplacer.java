package com.dib.replacer;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Setter
@Component("irr")
@PropertySource("classpath:com/dib/commons/info.properties")
public class IntrestRateReplacer implements MethodReplacer {

	@Value("${intr.rate}")
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
