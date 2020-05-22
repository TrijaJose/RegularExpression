package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexpreplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		final String regex = "^[^\\n\\w]*(\\w[^\\n]*\\w)[^\\n\\w]*$";
		final String string = "Kylie - accounts manager\n\n"
			 + " - accounts manager \n\n\n"
			 + "Accounts\n"
			 + "null\n"
			 + "s\n"
			 + "Accounts\n"
			 + "null\n"
			 + "s\n"
			 + "Fiona accounts\n"
			 + " account\n"
			 + "s\n"
			 + "Accounts Summa\n"
			 + " Summ\n"
			 + "a\n"
			 + " Jenny Accts\n\n"
			 + " Accts\n\n\n"
			 + "Maintenanc\n"
			 + "null\n"
			 + "c\n"
			 + "Wendy Acc\n"
			 + " Ac\n"
			 + "c\n"
			 + "Nicki Acc\n"
			 + " Ac\n"
			 + "c\n"
			 + "Anne\n"
			 + "null\n"
			 + "e\n"
			 + "Somerton\n"
			 + "null\n"
			 + "n\n"
			 + "Christine Accounts\n\n"
			 + " Accounts\n\n\n"
			 + "Andy left business\n\n"
			 + " left business\n\n\n"
			 + "Accounts\n"
			 + "null\n"
			 + "s\n"
			 + "Geelong\n"
			 + "null\n"
			 + "g\n"
			 + "Office\n"
			 + "null\n"
			 + "e\n";
		final String subst = "---$1--";

		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		final Matcher matcher = pattern.matcher(string);

		// The substituted value will be contained in the result variable
		final String result = matcher.replaceAll(subst);

		System.out.println("Substitution result: " + result);

	}

}
