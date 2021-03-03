package com.rakuten.test;

public class Calculator {
	
	
	int add(int a, int b) {
		//business logic
		return a+b;
	}
	
	int multiply(int a, int b) {
		//business logic
		return a*b;
	}
	
	int division(int a, int b) {
		//business logic
		if (b==0)
			throw new InvalidInputException();
		return a/b;
	}

	
}

class InvalidInputException extends RuntimeException{
	
}
