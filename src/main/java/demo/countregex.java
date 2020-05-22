package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class countregex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String regex = "(.*)(\\d+)(.*)";
		final String string = "This order was placed for QT3000! OK?";
		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		final Matcher matcher = pattern.matcher(string);
//        System.out.println("group Count" + matcher.results().count());
		while(matcher.find()) {
		System.out.println(matcher.group());
		}

		

	}

}
