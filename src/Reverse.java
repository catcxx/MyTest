/**
 * ��ʵ��һ���㷨���ڲ�ʹ�ö������ݽṹ�ʹ���ռ������£���תһ���������ַ���(����ʹ�õ������̱���)�� ����һ��string
 * iniString���뷵��һ��string��Ϊ��ת����ַ�������֤�ַ����ĳ���С�ڵ���5000�� ���������� "This is nowcoder" ���أ�
 * "redocwon si sihT"
 * 
 * @author Administrator
 *
 */
public class Reverse {

	public static void main(String[] args) {

		Reverse re = new Reverse();
		// re.reverseString("This is nowcoder");
		System.out.println(re.reverseString("This is nowcoder"));
	}

	public String reverseString(String iniString) {

		StringBuilder sb = new StringBuilder(iniString);

		sb.reverse();
		iniString = sb.toString();

		return iniString;

	}

}
