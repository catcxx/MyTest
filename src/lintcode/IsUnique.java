package lintcode;

public class IsUnique {
	public static void main(String[] args) {
		String str = "abvb";
		IsUnique iu = new IsUnique();
		
		System.out.println(iu.isUnique(str));
	}
	
	public boolean isUnique(String s) {
		for(int i=0;i<s.length();i++){
//			System.out.println(s.substring(i, i+1));
			if(((s.substring(i+1,s.length()))).contains(s.substring(i, i+1))){
				return false;
			}
		}
		return true;
    }
}
