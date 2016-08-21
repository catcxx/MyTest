package testfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class test03 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("D:\\testResult.txt");// 20w
		// File f1= new File("D:\\desk\\bisai2015\\testResult2.txt");
		File f2 = new File("D:\\0.csv");
		// File f3= new File("D:\\desk\\bisai2015\\sample3Result.txt");
		// FileWriter fileWriter=new
		// FileWriter("D:\\desk\\bisai2015\\0.csv");//20wid
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f1), "UTF-8"));// 构造一个BufferedReader类来读取文件
		BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream(f2), "UTF-8"));// 构造一个BufferedReader类来读取文件
		// BufferedReader br3 = new BufferedReader(new InputStreamReader(new
		// FileInputStream(f3),"UTF-8"));//构造一个BufferedReader类来读取文件

		String result = "";
		String result2 = "";
		// String result3="";
		// String[] res={null,null,null,null,null,null,null,null,null};
		int countline = 0;
		Double num1;
		Double num2;
		// int num3;
		while ((result = br.readLine()) != null) {
			// result=result.substring(1,2);//result.length()-2
			// String[] res=result.split("\t");

			result2 = br2.readLine();
			// result3 = br3.readLine();
			// String[] res2=result2.split("\r");
			// String res1=res[4];
			// String res2=res[5];
			// System.out.print(res.length );
			// res[1]=new String(res[1].getBytes(),"UTF-8");

			// if(res.length==2){
			num1 = Double.valueOf(result);
			num2 = Double.valueOf(result2);
			// num3 = Integer.valueOf(result3);
			if ((num1 - num2) != 0) {
				countline++;
				// System.out.println(1);
			}

		}
		System.out.println("done!" + countline);
		// fileWriter.close();
	}
}
