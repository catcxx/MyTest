import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ���дһ�����������ַ����еĿո�ȫ���滻Ϊ��%20�����ٶ����ַ������㹻�Ŀռ����������ַ�������֪���ַ�������ʵ����(С�ڵ���1000)��
 * ͬʱ��֤�ַ����ɴ�Сд��Ӣ����ĸ��ɡ� ����һ��string iniString Ϊԭʼ�Ĵ����Լ����ĳ��� int len, �����滻���string��
 * ���������� "Mr John Smith��,13 ���أ�"Mr%20John%20Smith" ��Hello World��,12
 * ���أ���Hello%20%20World��
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
