/**
 * 请实现一个算法，确定一个字符串的所有字符是否全都不同。这里我们要求不允许使用额外的存储结构。 给定一个string
 * iniString，请返回一个bool值,True代表所有字符全都不同，False代表存在相同的字符。
 * 保证字符串中的字符为ASCII字符。字符串的长度小于等于3000。 测试样例： "aeiou"返回：True "BarackObama" 返回：False
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
	 * 用了另外的空间
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
