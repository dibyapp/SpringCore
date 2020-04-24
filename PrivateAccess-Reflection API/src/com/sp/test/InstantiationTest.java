package com.sp.test;

import java.lang.reflect.Constructor;

import com.sp.component.Test;

public class InstantiationTest {

	public static void main(String[] args) {
		Class c=null;
		Constructor cons[]=null;
		Test t1=null,t2=null;
		
		try {
			c=Class.forName("com.sp.component.Test");
			cons=c.getDeclaredConstructors();
			cons[0].setAccessible(true);
			cons[1].setAccessible(true);
			
			
			t1=(Test)cons[1].newInstance();
			System.out.println(t1);
			System.out.println();
			t2=(Test)cons[0].newInstance(10,20);
			System.out.println(t2);
		}
		catch (InstantiationException iae) {
			iae.printStackTrace();
		}
		catch (IllegalAccessException ilae) {
			ilae.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
}
}

