import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 请编写一个方法，将字符串中的空格全部替换为“%20”。假定该字符串有足够的空间存放新增的字符，并且知道字符串的真实长度(小于等于1000)，
 * 同时保证字符串由大小写的英文字母组成。 给定一个string iniString 为原始的串，以及串的长度 int len, 返回替换后的string。
 * 测试样例： "Mr John Smith”,13 返回："Mr%20John%20Smith" ”Hello World”,12
 * 返回：”Hello%20%20World”
 * 
 * @author Administrator
 *
 */

public class Replacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Replacement Re = new Replacement();
		String re = Re.replaceSpace("Mr John Smith", 13);
		System.out.println(re);
	}

	public String replaceSpace(String iniString, int length) {
		String rep = null;
		Pattern pattern = Pattern.compile("^[A-Za-z\\s]+$");

		Matcher matcher = pattern.matcher(iniString);
		boolean matchFound = matcher.matches();
		// System.out.println(matchFound);
		if (length <= 1000 && matchFound) {
			rep = iniString.replace(" ", "%20");
		}
		return rep;
	}

}
