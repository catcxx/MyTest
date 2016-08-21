package testgps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Getstr {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// File f1= new File("G:\\in\\*");//20w
		File filelist = new File("F:\\sparkshare\\getstratege\\stra\\0613\\good\\step1");
		// File f2= new File("G:\\str\\strday\\1");
		FileWriter fileWriter = new FileWriter("F:\\sparkshare\\getstratege\\startandend\\end\\13\\1");// 20wid
		String[] file = filelist.list();
		System.out.println(file.length);
		for (int i = 0; i < file.length; i++) {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream("F:\\sparkshare\\getstratege\\stra\\0613\\good\\step1\\" + file[i]), "UTF-8"));// 构造一个BufferedReader类来读取文件
			// BufferedReader br2 = new BufferedReader(new InputStreamReader(new
			// FileInputStream(f2),"UTF-8"));//构造一个BufferedReader类来读取文件

			String result = "";
			String result2 = "";
			// String[] res={null,null,null,null,null,null,null,null,null};
			int countline = 0;
			while ((result = br.readLine()) != null) {
				// result=result.substring(1,2);//result.length()-2
				String[] res = result.split("\t");
				String[] res1 = result.split(",");
				int hour = Integer.parseInt(res1[2].substring(11, 13));
				// result2 = br2.readLine();
				// double dn = Double.valueOf(result2);
				// int n = (int) dn;
				// String[] res2=result2.split("\r");
				// String res1=res[4];
				// String res2=res[5];
				// System.out.print(res.length );
				// res[1]=new String(res[1].getBytes(),"UTF-8");

				// if(res[1].equals("start")&&((hour>=7)&&(hour<18))){
				if (((hour >= 7) && (hour < 18))) {
					if (!res[1].equals("start")) {
						fileWriter.write(res1[3] + " " + res1[4] + " " + res[1] + "\n");
						// System.out.println(res[1]);
						System.out.println(res1[3] + " " + res1[4] + " " + res[1]);
					}
				}

				// fileWriter.write(result+","+n+"\n");

				// System.out.println(res[1]);

				countline++;
			}
			System.out.println("done!" + countline);

		}
		fileWriter.close();
	}

}
