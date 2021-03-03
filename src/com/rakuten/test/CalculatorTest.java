package com.rakuten.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test_Add() {
	  Calculator c=new Calculator();
	  int a = c.add(10, 5);
	  assertEquals(15,a);
	}
	
	@Test
	void test_Product() {
	  Calculator c=new Calculator();
	  int a = c.multiply(10, 5);
	  assertEquals(50,a);
	}

}
