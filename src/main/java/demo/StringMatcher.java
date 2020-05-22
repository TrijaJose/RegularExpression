package demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatcher {
	public static void main(String arhs[]) {

		final String regex = "( ?[^\\d\\n\\)\\- ]+([a-zA-Z \\-]+)*([^ \\-\\(\\d]))";
		final String string = "9396 0347-Kylie - accounts manager\n" + "Accounts (03) 9673 0300\n"
				+ "Accounts - (08) 9203 1221\n" + "Fiona accounts 5224 2399\n" + "Accounts Summa 8562 5719\n"
				+ "5224 9301- Jenny Accts\n" + "Maintenanc 5259 0009\n" + "Wendy Acc 9429 7411\n"
				+ "Nicki Acc 8360 9899\n" + "Anne (03) 9311 9988\n" + "Somerton 9308 7800\n" + "Christine Accounts\n"
				+ "Andy left business\n" + "Accounts 9369 6626\n" + "Geelong 5277 2000\n" + "Office 9329 9587";
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the String");
//		String stringExpression= sc.nextLine();

		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		final Matcher matcher = pattern.matcher(string);
		final String subst = "---$1--";
		while (matcher.find()) {
			System.out.println("Full match: " + matcher.group(0));

			final String result = matcher.replaceAll(subst);
			System.out.println("Substitution result: " + result);
//			System.out.println("First match: " + matcher.group(2));
//			for (int i = 1; i <= matcher.groupCount(); i++) {
//				System.out.println(/*"Group " + i + ": " + */matcher.group(i));
//			
//			}
		}
	}

}
