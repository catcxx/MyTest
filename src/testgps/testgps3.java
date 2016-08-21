package testgps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class testgps3 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("D:\\1");
		String str0 = "D:\\desk\\";
		Set<String> set = new HashSet<String>();

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f1), "UTF-8"));// 构造一个BufferedReader类来读取文件

		int countline = 0;
		String result = " ";
		FileWriter fileWriter = null;
		String str2 = null;
		while ((result = br.readLine()) != null) {

			String[] res = result.split(",");
			String str1 = res[1];
			// str2 = res[1];
			if (!set.contains(str1)) {
				if (!str1.equals(str2) || str2 == null) {
					fileWriter = new FileWriter(str0 + str1 + ".txt");

					fileWriter.write(res[1] + "," + res[2] + "," + res[3] + "," + res[4] + "," + res[5] + "," + res[6]
							+ "," + res[7] + "\r\n");
					System.out.println("///" + result);
				}
				set.add(str1);
				countline++;
			} else {
				if (str1.equals(res[1])) {
					fileWriter.write(res[1] + "," + res[2] + "," + res[3] + "," + res[4] + "," + res[5] + "," + res[6]
							+ "," + res[7] + "\r\n");
					System.out.println("????" + result);
				}
				countline++;
			}
			str2 = res[1];
		}
		fileWriter.close();
		// while ((result=br.readLine())!=null) {
		//
		// fileWriter.write(res[1]+","+res[2]+","+res[3]+","+res[4]+","+res[5]+","+res[6]+","+res[7]+"\n");
		// System.out.println(result);
		// fileWriter.close();
		// countline++;
		// }
		System.out.println("done!" + countline);
	}
}
