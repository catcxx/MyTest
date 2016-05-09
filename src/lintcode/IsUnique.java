package lintcode;

import java.util.TreeSet;

/**
 * ÅÐ¶Ï×Ö·û´®ÊÇ·ñÃ»ÓÐÖØ¸´×Ö·û
 * @author Administrator
 *
 */
public class IsUnique {
	public static void main(String[] args) {
		String str = "abvb";
		IsUnique iu = new IsUnique();
		
		System.out.println(iu.isUnique5(str));
	}
	
	/**
	 * solution 0
	 * @param s
	 * @return
	 */
	public boolean isUnique(String s) {
		for(int i=0;i<s.length();i++){
//			System.out.println(s.substring(i, i+1));
			if(((s.substring(i+1,s.length()))).contains(s.substring(i, i+1))){
				return false;
			}
		}
		return true;
    }
	
	/**
	 * solution 1
	 * @param str
	 * @return
	 */
	   public boolean isUnique1(String str) {
	        // write your code here
	        for(int i=0;i<str.length();i++){
	            for(int j=i+1;j<str.length();j++){
	                if(str.charAt(i)==str.charAt(j))
	                    return false;
	            }
	        }
	        return true;
	    }
	   
	   /**
	    * solution 2
	    * @param str
	    * @return
	    */
	   public boolean isUnique2(String str) {
	        // write your code here
	        TreeSet set = new TreeSet();
	        for(int i=0;i<str.length();i++){
	            if(set.add(str.charAt(i))==false){//already contain
	                return false;
	            }
	        }
	        return true;
	    }
	   
	   /**
	    * solution 3
	    * @param str
	    * @return
	    */
	   public boolean isUnique3(String str) {
	        // write your code here
	        char[] char_set = str.toCharArray();
	        java.util.Arrays.sort(char_set);
	        String str_sorted = new String(char_set);
//	        System.out.println(str_sorted);
	        for(int i=0;i+1<str.length();i++){
	            if(str_sorted.charAt(i)==str_sorted.charAt(i+1)){
	                return false;
	            }
	        }
	        return true;
	    }
	   
	   /**
	    * solution 4
	    * @param str
	    * @return
	    */
	   public boolean isUnique4(String str) {
	        // write your code here
	        boolean[] char_set = new boolean[256];//assume ascii
	        for(int i=0;i<str.length();i++){
	        	if(char_set[str.charAt(i)]){return false;}
	        	char_set[str.charAt(i)]=true;
	        }
	        return true;
	    }

	   /**
	    * solution 5
	    * @param str
	    * @return
	    */
	   public boolean isUnique5(String str) {
	        // write your code here
	        int[] char_set = new int[256];
	        for(int i=0;i<str.length();i++){
	        	char_set[str.charAt(i)]++;
	        	if(char_set[str.charAt(i)]>1){return false;}
	        }
	        return true;
	    }
}
