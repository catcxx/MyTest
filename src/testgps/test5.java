package testgps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Set;

public class test5 {
	// AT00422011-06-13 07 11.728846924523774
	public static void main(String[] args) throws IOException {
		File f1 = new File("F:\\sparkshare\\salary\\hoursalary\\0617\\good\\saph2\\part-r-00000");// C://Users//Administrator//Desktop//Result.txt
		FileWriter fileWriter = new FileWriter("F:\\sparkshare\\salary\\5daysalry\\0617\\good\\1");
		BufferedReader br = new BufferedReader(new FileReader(f1));// 构造一个BufferedReader类来读取文件
		String result = " ";
		int countline = 0;
		double count7 = 0, count8 = 0, count9 = 0, count10 = 0, count11 = 0, count12 = 0, count13 = 0, count14 = 0,
				count15 = 0, count16 = 0, count17 = 0;
		while ((result = br.readLine()) != null) {
			String[] res = result.split("\t");

			// result.substring(17, 19)= result.substring(17, 19);
			System.out.println("result:" + result.substring(17, 19));
			if (res.length == 2) {
				if (result.substring(17, 19).equals("07")) {

					double res3 = Double.parseDouble(res[1]);
					count7 += res3;

				} else if (result.substring(17, 19).equals("08")) {
					double res3 = Double.parseDouble(res[1]);
					count8 += res3;
				} else if (result.substring(17, 19).equals("09")) {
					double res3 = Double.parseDouble(res[1]);
					count9 += res3;
				} else if (result.substring(17, 19).equals("10")) {
					double res3 = Double.parseDouble(res[1]);
					count10 += res3;
				} else if (result.substring(17, 19).equals("11")) {
					double res3 = Double.parseDouble(res[1]);
					count11 += res3;
				} else if (result.substring(17, 19).equals("12")) {
					double res3 = Double.parseDouble(res[1]);
					count12 += res3;
				} else if (result.substring(17, 19).equals("13")) {
					double res3 = Double.parseDouble(res[1]);
					count13 += res3;
				} else if (result.substring(17, 19).equals("14")) {
					double res3 = Double.parseDouble(res[1]);
					count14 += res3;
				} else if (result.substring(17, 19).equals("15")) {
					double res3 = Double.parseDouble(res[1]);
					count15 += res3;
				} else if (result.substring(17, 19).equals("16")) {
					double res3 = Double.parseDouble(res[1]);
					count16 += res3;
				} else if (result.substring(17, 19).equals("17")) {
					double res3 = Double.parseDouble(res[1]);
					count17 += res3;
				}

				countline++;
			}
		}
		System.out.println("done!" + "\n" + "lines:" + countline);
		System.out.println("done!" + "\n" + count7 + " " + count8 + " " + count9 + " " + count10 + " " + count11 + " "
				+ count12 + " " + count13 + " " + count14 + " " + count15 + " " + count16 + " " + count17 + " ");
		fileWriter.write(count7 + " " + count8 + " " + count9 + " " + count10 + " " + count11 + " " + count12 + " "
				+ count13 + " " + count14 + " " + count15 + " " + count16 + " " + count17);
		;
		fileWriter.close();
	}

}
