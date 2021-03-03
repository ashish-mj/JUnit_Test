package com.rakuten.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    
	static Calculator c=null;
	@BeforeAll
	public static void beforeAll() {
		c=new Calculator();
	}
	
	@BeforeEach
	public void init() {
		//open the res
		System.out.println("init before each...");
	}
	@AfterEach
	void destroy() {
		//closing the res
		System.out.println("cleanup ..");
	}

	@Test
	@Disabled
	void test_Add() {
	  
	  int a = c.add(10, 5);
	  assertEquals(15,a);
	}
	
	@Test
	void test_Product() {
	  
	  int a = c.multiply(10, 5);
	  assertEquals(50,a);
	}
	
	@Test
	void test_Divide() {
		 
		  int a = c.division(10, 5);
		  assertEquals(2,a);
		}
	
	@Test
	@DisplayName("Exception Case")
	void test_Divide_1() {
		 
		  assertThrows(InvalidInputException.class, ()->c.division(10,0));
		}

}
