package suanfa;

/**
 * �ַ����е�һ��ֻ����һ�ε��ַ�������Ż��㷨ʹ�ñ����������٣�
 * 
 * @author Administrator
 *
 */
public class FirstNotDulplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(doit1(new String("ddssfddftirs")));
	}
	
	
	/**
	 * ��һ��ֻ����һ�ε��ַ�
	 * @param str
	 * @return
	 */
	public static char doit1(String str) {
		// write code here
		int[] count=new int[256];
		char[] letters=str.toCharArray();  
		for(char c:letters){
			count[c]++;
		}
		for(int i=0;i<str.length();i++){
			if(count[str.charAt(i)]==1){return str.charAt(i);}
		}
		return '\0';// use \0 if no char fits
	}

//	/**
//	 * ��һ��ֻ����һ�ε��ַ�,������������У���
//	 * @param str
//	 * @return
//	 */
//	public static char doit1(String str) {
//		// write code here
//
//		for (int i = 0; i < str.length() - 1; i++) {
////			
//			for (int j = i + 1; j < str.length(); j++) {
//				if(str.charAt(i) == str.charAt(j)){i++;break;}
////				System.out.println("i:"+i+", j:"+j+str.charAt(i)+"=="+str.charAt(j));		
//				if((str.charAt(i) != str.charAt(j))&&(j==str.length()-1)){return 	str.charAt(--i);}
//			}
//			
//			
//		}
//		return '\0';// use \0 if no char fits
//	}
	
	/**
	 * ��һ���ظ����ֵ��ַ�
	 * @param str
	 * @return
	 */
	public static char doit(String str) {
		// write code here

		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return str.charAt(i);
				}
			}
		}
		return '\0';// use \0 if no char fits
	}

}
