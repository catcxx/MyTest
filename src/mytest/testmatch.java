package mytest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testmatch {
	
 public static void main(String[] args){
	String text = "������(������)(������)(������)";
	Pattern pattern = Pattern.compile(".*?(?=\\()" );
	Matcher matcher = pattern.matcher(text);
	if (matcher.find()) {
	System.out.println(matcher.group(0));
	}
}
}
