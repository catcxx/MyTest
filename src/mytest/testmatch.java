package mytest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testmatch {
	
 public static void main(String[] args){
	String text = "北京市(海淀区)(朝阳区)(西城区)";
	Pattern pattern = Pattern.compile(".*?(?=\\()" );
	Matcher matcher = pattern.matcher(text);
	if (matcher.find()) {
	System.out.println(matcher.group(0));
	}
}
}
