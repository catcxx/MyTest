/**
 * ��ʵ��һ���㷨��ȷ��һ���ַ����������ַ��Ƿ�ȫ����ͬ����������Ҫ������ʹ�ö���Ĵ洢�ṹ�� ����һ��string
 * iniString���뷵��һ��boolֵ,True���������ַ�ȫ����ͬ��False���������ͬ���ַ���
 * ��֤�ַ����е��ַ�ΪASCII�ַ����ַ����ĳ���С�ڵ���3000�� ���������� "aeiou"���أ�True "BarackObama" ���أ�False
 * 
 * @author Administrator
 *
 */
public class Different {

	public static void main(String[] args) {
		Different cd = new Different();
		// cd.checkDifferent("this");
		System.out.println(cd.checkDifferent("thiis"));
	}

	/**
	 * ��������Ŀռ�
	 */
	// public boolean checkDifferent(String iniString) {
	// boolean bo=true;
	// for(int i = 0;i<iniString.length()-1;i++){
	// String ch1 = iniString.substring(i, i+1);
	// String ch2;
	// if(i>0){
	// ch2 = (iniString.substring(0, i-1)).concat(iniString.substring(i+1,
	// iniString.length()-1));
	// }else{
	// ch2 = (iniString.substring(i+1, iniString.length()-1));
	// }
	//
	// if(ch2.contains(ch1)){
	// bo=false;
	// }
	// }
	//
	// return bo;
	// }

	public boolean checkDifferent(String iniString) {
		boolean bo = true;

		for (int i = 0; i < iniString.length() - 1; i++) {
			for (int j = i + 1; j < iniString.length() - 1; j++) {
				if (iniString.charAt(i) == iniString.charAt(j)) {
					bo = false;
				}
			}
		}
		return bo;
	}

}
