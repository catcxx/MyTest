
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedList;

public class Testfilestring {

	/*
	 * public static void read1() { RandomAccessFile r = null; try { r = new
	 * RandomAccessFile(new File("D:/1.txt"),"r"); byte[] c = new byte[4];
	 * r.read(c, 2, 4); System.out.println(new String(c)); } catch (Exception e)
	 * { try { r.close(); } catch (IOException e1) { e1.printStackTrace(); }
	 * e.printStackTrace(); }
	 * 
	 * }
	 */

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader("D:\\test1.txt"));

		String line = "";
		String str = "";

		while (((line = in.readLine()) != null)) {
			str += line;
		}

		String[] list = str.split(" ");
		System.out.println("------");
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println(list.length);
		// System.out.println("str=" + str);
	}
}
