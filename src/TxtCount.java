import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TxtCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("d:\\test1.txt"));
		StringBuilder sb = new StringBuilder();
		while (true) {
			String str = br.readLine();
			if (str == null)
				break;
			sb.append(str);
		}
		System.out.println(sb);
		//split
		Pattern p = Pattern.compile("hello");
		Matcher m = p.matcher(sb);
		int count = 0;
		while (m.find()) {
			count++;
		}
		System.out.println("hello一共出现了" + count + "次");
	}

}
