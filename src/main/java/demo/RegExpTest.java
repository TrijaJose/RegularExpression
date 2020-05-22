package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest {
	final static String regex = "( ?[^\\d\\n\\)\\- ]+([a-zA-Z \\-]+)*([^ \\-\\(\\d]))";
	final static String string = "Hello World";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(string);
		while (match.find()) {
			System.out.println(match.group(0));
			for (int i = 0; i < match.groupCount(); i++) {
				System.out.println("GROUP" + "-" + i + ":" + match.group(i));
			}
		}

	}

}
