package demo;

import org.testng.annotations.Test;

public class Dependency {
	@Test
	public static void FirstTest() {
		System.out.println("This is the first Test Case to be executed");
	}

	@Test(dependsOnMethods = { "FirstTest" })
	public static void SecondTest() {
		System.out.println("This is the second Test Case to be executed; This is a Dependent method");
	}

	@Test(dependsOnMethods = { "SecondTest" })
	public static void FinalTest() {
		System.out.println("This is the Final Test Case; It will be executed anyway.");
	}
}
