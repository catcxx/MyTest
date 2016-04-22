import javax.swing.JOptionPane;

/**
 * use jOptionPane to get input
 * @author Administrator
 *
 */
public class UseJOptionPane {
	 public static void main(String[] args) {
		 String input1 = JOptionPane.showInputDialog("please input first number: ");
		 double in1= Double.parseDouble(input1);
		 String input2 = JOptionPane.showInputDialog("please input second number: ");
		 double in2= Double.parseDouble(input2);           //×Ö·û´®×ª»»Îªdouble
		 
		// System.out.println("sum is : "+(in1+in2));
		double sum=in1+in2;
		String out = "sum : "+sum;
		JOptionPane.showMessageDialog(null,out);
		
		JOptionPane.showConfirmDialog(null, "continue?");
	 }
}
