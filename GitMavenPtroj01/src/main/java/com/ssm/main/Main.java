package com.ssm.main;

import com.ssm.service.Arethmetic;

public class Main {
	
	public static void main(String[] args) {
		Arethmetic ar = new Arethmetic();
		System.out.println("Sum is :"+ar.doSum(10, 20));
	}
}
