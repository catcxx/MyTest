package testfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class testlt {
	public static void main(String[] args) throws IOException {
		File f1 = new File("D:\\desk\\lt.txt");// 20w
		FileWriter fileWriter = new FileWriter("D:\\desk\\ltres");// 20wid
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(f1), "UTF-8"));// 构造一个BufferedReader类来读取文件

		String result = "";
		int countline = 0;
		long sum=0;
		while ((result = br.readLine()) != null&&countline<500000) {
			String[] res = result.split("\t");
			
			
			if(res[4].startsWith("Android")){
				res[4]="0";
//				System.out.println(res[4]);
			}else if(res[4].startsWith("iOS")){
				res[4]="1";
//				System.out.println(res[4]);
			}else if(res[4].startsWith("Symbian")){
				res[4]="2";
			}else if(res[4].startsWith("Windows")){
				res[4]="3";
			}else{
				res[4]="5";//other
			}
			
			if(!res[5].startsWith("NaN")){
//				countline++;
			fileWriter.write( res[3] + ","
					+ res[4] + "," + res[5] + "," + res[6] + "," + res[7]+ ","
					+ res[8]+ ","+res[9]+"\n");
			sum=sum+Long.parseLong(res[5]);
//			System.out.println(res[5]);
			}else if(res[5].startsWith("NaN")){
				res[5]="1";
				fileWriter.write( res[3] + ","
						+ res[4] + "," + res[5] + "," + res[6] + "," + res[7]+ ","
						+ res[8]+ ","+res[9]+"\n");
				sum=sum+Long.parseLong(res[5]);
			}
//			System.out.println(result);

			countline++;
		}
		System.out.println("done!" + countline);
		System.out.println(sum/countline);
		fileWriter.close();
	}
}
