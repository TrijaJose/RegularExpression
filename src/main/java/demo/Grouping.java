package demo;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups = { "MyGroup" })
	public static void FirstTest() {
		System.out.println("This is a part of the Group: MyGroup");
	}

	@Test(groups = { "MyGroup" })
	public static void SecondTest() {
		System.out.println("This is also a part of the Group: MyGroup");
	}

	@Test
	public static void ThirdTest() {
		System.out.println("But, this is not a part of the Group: MyGroup");
	}

}
