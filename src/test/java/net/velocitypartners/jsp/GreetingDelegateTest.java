package net.velocitypartners.jsp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingDelegateTest {

	private GreetingDelegate greetingDelegate;
	
	@Before
	public void setup(){
		greetingDelegate = new GreetingDelegate();
	}
	
	@Test public void testGreeting(){
		//When
		String greeting = greetingDelegate.getGreeting();
		//Then
		assertEquals(greeting, "Welcome to the Jenkins Training");
	}
}
