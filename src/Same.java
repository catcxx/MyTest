import java.util.HashMap;

public class Same {

	public static void main(String[] args) {
		Same sm = new Same();
		// sm.checkSam("This is nowcoder","is This nowcoder");
		System.out.println(sm.checkSam("This is nowcoder", "is This nowcoder"));

	}

	public boolean checkSam(String stringA, String stringB) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		if (stringA.length() != stringB.length())
			return false;
		char c = '\0';
		for (int i = 0; i < stringA.length(); i++) {
			c = stringA.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (int i = 0; i < stringB.length(); i++) {
			c = stringB.charAt(i);
			if (map.containsKey(c)) {
				if (map.get(c) - 1 < 0)
					return false;
				map.put(c, map.get(c) - 1);
			} else {
				return false;
			}
		}
		return true;
	}

	// public boolean checkSam(String stringA, String stringB) {
	// boolean bo = false;
	// // StringBuilder sb = null;
	// Set sea = new HashSet();
	// Set seb = new HashSet();
	// if(stringA.length()==stringB.length()){
	//
	// for(int i=0;i < stringA.length();i++){
	//
	// sea.add(stringA.charAt(i));
	// seb.add(stringB.charAt(i));
	// }
	//
	// if(sea.size()==sea.size()){
	// int counta = 0;
	// int countb = 0;
	// for(int i = 0;i < stringA.length();i++){
	//
	//
	// if((stringA.substring(i+1)).contains(stringA.substring(i, i+1))){
	//
	// }
	// counta++;
	// }
	// if(counta==countb){
	//
	// }
	// }
	// }
	// return bo;
	// }

}
