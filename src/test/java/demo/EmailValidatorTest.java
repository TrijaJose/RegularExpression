package demo;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmailValidatorTest {
	public EmailValidator validatorObj;

	@BeforeClass
	public void init() {
		validatorObj = new EmailValidator();
	}

	@DataProvider
	public Object[][] validUsernameProvider() {
		return new Object[][] { { new String[] { "anu@gmail.com", "meera@gmail.com", "nayama123@gmail.com" } }

		};
	}

	@DataProvider
	public Object[][] invalidUsernameProvider() {
		return new Object[][] { { new String[] { "ghjkj", "dfghj", "dfghjkl" } }

		};

	}

	@Test(dataProvider = "validUsernameProvider")
	public void validUsername(String[] username) {
		for (String temp : username) {
			boolean valid = validatorObj.validate(temp);
			System.out.println("Username is valid : " + temp + " , " + valid);
			Assert.assertEquals(true, valid);
		}
	}

	@Test(dataProvider = "invalidUsernameProvider", dependsOnMethods = "validUsername")
	public void invalidUsername(String[] username) {
		for (String temp : username) {
			boolean invalid = validatorObj.validate(temp);
			System.out.println("Invalid username:" + temp + "," + invalid);
			Assert.assertEquals(false, invalid);
		}
	}

}
