
public abstract class Testfh {

	public static void stringReplace1(String text) {
		text = text.replace('j', 'l');
	}

	public static String stringReplace(String text) {
		text = text.replace('j', 'l');
		return text;
	}

	public static void bufferReplace(StringBuffer text) {
		text = text.append("c");
	}

	// public class something{//
	// void doso(){
	// private String ssa="";
	// int ii=ssa.length();
	// }
	// }

	// abstract class something{
	// private String ssa;
	// public abstract boolean isst(String ssa);
	//
	// }

	public abstract void something();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textString = new String("java");
		String textString1 = new String("java");
		StringBuffer textBuffer = new StringBuffer("java");

		stringReplace1(textString);
		textString = stringReplace(textString);
		bufferReplace(textBuffer);
		System.out.print(textString1 + textString + textBuffer);
	}

}
