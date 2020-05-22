package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile(".xx.");
		Matcher matcher = pattern.matcher("Axxb");
		System.out.println("String Matches the Given Regular Expression:" + matcher.matches());
	}

}
