/**
 * 判断字符串s2是否为s1的旋转生成
 * @author Administrator
 *
 */
public class ReverseEqual {

	public static void main(String[] args) {
		ReverseEqual rs = new ReverseEqual();
		//rs.checkReverseEqual("waterbottle", "erbottlewat");
		System.out.print(rs.checkReverseEqual("waterbottle", "erbottlewat"));
	}
	
	
	
	public boolean checkReverseEqual(String s1, String s2) {
	if (s1 == null || s2 == null) {
        return false;
    }

    if (s1.length() != s2.length() || s1.length() == 0 || s2.length() == 0) {
        return false;
    }

    s1 = s1.concat(s1);
    //contain<-->
    return s1.contains(s2);
	}
	
	
	
}
