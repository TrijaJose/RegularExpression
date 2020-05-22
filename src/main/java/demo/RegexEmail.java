package demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> emailCollection = readEmails();
		for (String readEmails : emailCollection)
			try {
				{
					List<String> emailMatcherCollection = emailmatcher(readEmails);
					for (String emailMatcher : emailMatcherCollection) {
						System.out.println(emailMatcher);
						fileWriter(emailMatcher);
						System.out.println("git requirements");

					}
				}
			} catch (Exception ex) {
				System.out.println(ex);
			}
	}

	private static void fileWriter(String emailMatcher) throws IOException {
		// TODO Auto-generated method stub
//    	List<String> writeEmailMatcher = new ArrayList<String>();
		String fileContent = emailMatcher;
		FileWriter fileWriter = new FileWriter("C:\\\\Users\\\\Dreams\\\\Desktop\\\\emailMatcher.txt",true);
		PrintWriter printWriter = new PrintWriter(fileWriter);
	    printWriter.println(fileContent);
	    printWriter.close();
//		return writeEmailMatcher;
	}

	private static List<String> emailmatcher(String readEmails) {
		// TODO Auto-generated method stub
		List<String> emailMatcherCollection = new ArrayList<String>();
		final String regex = "\\w+(\\w\\.)+\\w+\\@(\\w+\\.\\w+)";
		final String emailString = readEmails;
		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		final Matcher matcher = pattern.matcher(emailString);

		while (matcher.find()) {
			String emailmatcher = matcher.group(0);
			emailMatcherCollection.add(emailmatcher);
		}
		return emailMatcherCollection;
	}

	private static List<String> readEmails() {
		// TODO Auto-generated method stub
		List<String> emailCollection = new ArrayList<String>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("C:\\\\Users\\\\Dreams\\\\Desktop\\\\email.txt"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println();
				emailCollection.add(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return emailCollection;
	}

}
