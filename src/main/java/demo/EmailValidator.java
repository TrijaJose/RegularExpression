package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

	private Pattern pattern;
	private Matcher matcher;
	private static final String USERNAME_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";;

	public EmailValidator() {
		pattern = Pattern.compile(USERNAME_PATTERN);
	}

	public boolean validate(final String username){

		  matcher = pattern.matcher(username);
		  return matcher.matches();

	  }

}
