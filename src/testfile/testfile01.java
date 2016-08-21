package testfile;

/**
 * 处理文本文件
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.stream.FileImageInputStream;

public class testfile01 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("D:\\20Wid.txt");// 20w
		File f2 = new File("D:\\0.csv");
		FileWriter fileWriter = new FileWriter("D:\\20Wreszhuhe.csv");// 20wid
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f1), "UTF-8"));// 构造一个BufferedReader类来读取文件
		BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream(f2), "UTF-8"));// 构造一个BufferedReader类来读取文件

		String result = "";
		String result2 = "";
		// String[] res={null,null,null,null,null,null,null,null,null};
		int countline = 0;
		while ((result = br.readLine()) != null) {
			// result=result.substring(1,2);//result.length()-2
			// String[] res=result.split("\t");

			result2 = br2.readLine();
			double dn = Double.valueOf(result2);
			int n = (int) dn;
			// String[] res2=result2.split("\r");
			// String res1=res[4];
			// String res2=res[5];
			// System.out.print(res.length );
			// res[1]=new String(res[1].getBytes(),"UTF-8");

			fileWriter.write(result + "," + n + "\n");

			System.out.println(result + "," + n);

			countline++;
		}
		System.out.println("done!" + countline);
		fileWriter.close();
	}
}
