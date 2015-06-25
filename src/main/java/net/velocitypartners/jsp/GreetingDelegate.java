package net.velocitypartners.jsp;

import org.springframework.stereotype.Component;
/**
 * Class responsible for returning the greetings
 * @author training
 *
 */
@Component
public class GreetingDelegate {

	/**
	 * Get the greeting message
	 * @return the greeting message 
	 */
	public String getGreeting(){
		return "Welcome to the Jenkins Training 2";
	}
}
