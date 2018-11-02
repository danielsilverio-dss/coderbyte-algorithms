package com.coderbyte.danielsilverio.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstFactorialTest {
	
	@Test
	public void shouldReturn0IfParemeterIs0() {
		assertEquals(0, FirstFactorial.FirstFactorial( 0 ));		
	}

	@Test
	public void shouldReturn1IfParemeterIs1() {
		assertEquals(1, FirstFactorial.FirstFactorial( 1 ));		
	}
	
	@Test
	public void shouldReturn24IfParameterIs4() {
		assertEquals(24, FirstFactorial.FirstFactorial( 4 ));
	}

	@Test
	public void shouldReturnOutput40320IfParameterIs8() {
		assertEquals(40320, FirstFactorial.FirstFactorial( 8 ));
	}
	
	@Test( expected = IllegalArgumentException.class )
	public void shouldReturnErrorIfParameterIsNegative() {
		FirstFactorial.FirstFactorial(-1);
	}

}
