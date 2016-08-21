package testfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class testfile02 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("D:\\testResult1.txt");// 20w
		File f2 = new File("D:\\testResult2.txt");
		File f3 = new File("D:\\testResult3.txt");
		FileWriter fileWriter = new FileWriter("D:\\0.csv");// 20wid
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f1), "UTF-8"));// 构造一个BufferedReader类来读取文件
		BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream(f2), "UTF-8"));// 构造一个BufferedReader类来读取文件
		BufferedReader br3 = new BufferedReader(new InputStreamReader(new FileInputStream(f3), "UTF-8"));// 构造一个BufferedReader类来读取文件

		String result = "";
		String result2 = "";
		String result3 = "";
		// String[] res={null,null,null,null,null,null,null,null,null};
		int countline = 0;
		int num1;
		int num2;
		int num3;
		while ((result = br.readLine()) != null) {
			// result=result.substring(1,2);//result.length()-2
			// String[] res=result.split("\t");

			result2 = br2.readLine();
			result3 = br3.readLine();
			// String[] res2=result2.split("\r");
			// String res1=res[4];
			// String res2=res[5];
			// System.out.print(res.length );
			// res[1]=new String(res[1].getBytes(),"UTF-8");

			// if(res.length==2){
			num1 = Integer.valueOf(result.substring(0, 1));// Double Integer
			num2 = Integer.valueOf(result2.substring(0, 1));
			num3 = Integer.valueOf(result3.substring(0, 1));
			if ((num1 + num2 + num3) >= 2) {
				fileWriter.write(1 + "\r\n");
				// System.out.println(1);
			} else {
				fileWriter.write(0 + "\r\n");
				// System.out.println(0);
			}

			countline++;
		}
		System.out.println("done!" + countline);
		fileWriter.close();
	}
}
