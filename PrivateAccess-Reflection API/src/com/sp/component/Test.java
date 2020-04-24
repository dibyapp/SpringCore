package com.sp.component;

public class Test {
	private int a,b;

	public Test(int a, int b) {
		System.out.println("Test.Test() 2-Param Constructor");
		this.a = a;
		this.b = b;
	}

	private Test() {
		System.out.println("Test.Test() 0-Param Constructor");
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
}
