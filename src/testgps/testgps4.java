package testgps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class testgps4 {
	
//	public int readfile(String result ) {
//		
//		File f1 = new File("D:\\1");
//		BufferedReader br = new BufferedReader(new InputStreamReader(
//				new FileInputStream(f1), "UTF-8"));// 构造一个BufferedReader类来读取文件
//		FileWriter fileWriter = null;
//		String[] res = result.split(",");
//		String str1 = res[1];
//		fileWriter = new FileWriter(str0 + str1 + ".txt");
//		if (!set.contains(str1)) {
//			if(!str1.equals(str2)||str2==null){
//			
//		} else {
//			if(str1.equals(res[1])){
//		
//			}
//		
//		}
//	fileWriter.close();
//    }
//}
	
	public static void main(String[] args) throws IOException {
		File f1 = new File("D:\\1");
		String str0 = "D:\\desk\\";
		Set<String> set = new HashSet<String>();

		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(f1), "UTF-8"));// 构造一个BufferedReader类来读取文件

		int countline = 0;
		String result = " ";
		String str2 = null;
		while ((result = br.readLine()) != null) {

			String[] res = result.split(",");
			String str1 = res[1];
			if(!str1.equals(str2)||str2==null){
			set.add(str1);
			
			}
			str2=res[1];
		}
		System.out.println(set); 

		
		FileWriter fileWriter = null;
		while ((result = br.readLine()) != null) {
			
			
		System.out.println("done!" + countline);
	}
}
}
