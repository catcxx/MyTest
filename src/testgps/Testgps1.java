package testgps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;


public class Testgps1 {

	public static void main(String[] args) throws IOException, ParseException {
		File f1 = new File("E:\\1.txt");// C://Users//Administrator//Desktop//Result.txt
		FileWriter fileWriter = new FileWriter("E:\\10.txt");
		BufferedReader br = new BufferedReader(new FileReader(f1));// 构造一个BufferedReader类来读取文件
		String result = " ";
		int countline = 0;
		while ((result = br.readLine()) != null) {
			String[] res = result.split(",|\\s+");
			// AU7970
			if (res.length == 9) {
				if (res[1].equals("陕AU7970")) {
					String sb = res[3].replaceAll(":", "");
					// System.out.println("你要的结果:" +sb);
					long res3 = Long.parseLong(sb);
					if (res3 > 150000 & res3 < 173000) {
						fileWriter.write(res[1] + "," + res[2] + "," + res[3]
								+ "," + res[4] + "," + res[5] + "," + res[6]
								+ "," + res[7] + "," + res[8] + "\r\n");
					}
				}
			} else {
				System.out.println(result);
			}

			countline++;
		}
		System.out.println("done!" + "\n"+"lines:"+countline);
		fileWriter.close();
	}

}
