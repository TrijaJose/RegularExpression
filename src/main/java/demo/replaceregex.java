package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class replaceregex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String regex = "^([a-zA-z\\-  ]{2,})?(( ?\\(?\\d[^\\d\\n\\-]?)+)([a-zA-z\\-  ]{2,})?$";
		final String string = "9396 0347-Kylie - accounts manager\n" + "Accounts (03) 9673 0300 \n"
				+ "Accounts  (08) 9203 1221\n" + "Fiona accounts 5224 2399\n" + "Accounts Summa 8562 5719\n"
				+ "5224 9301- Jenny Accts\n" + "Maintenanc 5259 0009\n" + "Wendy Acc 9429 7411\n"
				+ "Nicki Acc 8360 9899\n" + "Anne (03) 9311 9988\n" + "Somerton 9308 7800\n" + "Christine Accounts\n"
				+ "Andy left business\n" + "Accounts 9369 6626\n" + "Geelong 5277 2000\n" + "Office 9329 9587\n\n\n\n";
		final String subst = "$1$4 :$2";
		final String subst1 = "$1 : $2";
		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		final Matcher matcher = pattern.matcher(string);

		// The substituted value will be contained in the result variable
		final String newSearch = matcher.replaceAll(subst);
		System.out.println(newSearch);
		final String regex1 = "^[^\\n\\w]*(\\w([\\w \\-]+)\\w)[^\\w]*:([^\\n]+)";
		final Pattern pattern1 = Pattern.compile(regex1, Pattern.MULTILINE);
		final Matcher matcher1 = pattern1.matcher(newSearch);
		final String result = matcher1.replaceAll(subst1);
		System.out.println("Substitution result: " + "\n" + result);
		

	}

}
