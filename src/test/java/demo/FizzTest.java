package demo;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FizzTest {
	private static  fizzbuzz fizzbus;
	
	@BeforeClass 
	public static void start() {
		fizzbus=new fizzbuzz();
	}
     @Test
     public static void run() {
    	
    	 int number=1;
    	 String returnedNumber=fizzbus.play(number);
    	 AssertJUnit.assertEquals("1",returnedNumber);
     }
     
     @Test
     public static void fizztest(){
    	 int number=3;
    	 String returnedNumber=fizzbus.play(number);
    	 AssertJUnit.assertEquals("fizz",returnedNumber);
    	 
     }
     
}
