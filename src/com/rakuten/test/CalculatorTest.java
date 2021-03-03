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
	
	@Test
	void test_Divide() {
		  Calculator c=new Calculator();
		  int a = c.division(10, 5);
		  assertEquals(2,a);
		}
	
	@Test
	void test_Divide_1() {
		  Calculator c=new Calculator();
		  assertThrows(InvalidInputException.class, ()->c.division(10,0));
		}

}
