package testgps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StrategeCount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		{

			File f1 = new File("C:\\Users\\Administrator\\Desktop\\hadoop\\hadoop\\data\\aver\\stratege\\part-r-00000");
			FileWriter fileWriter = new FileWriter(
					"C:\\Users\\Administrator\\Desktop\\hadoop\\hadoop\\data\\aver\\stratege\\out");
			BufferedReader br = new BufferedReader(new FileReader(f1));// 构造一个BufferedReader类来读取文件
			String result = " ";
			// String[] res={null,null,null,null,null,null,null,null,null};
			int countline = 0;
			StringBuilder dis = new StringBuilder(" ");
			StringBuilder hunt = new StringBuilder(" ");
			StringBuilder wait = new StringBuilder(" ");
			while ((result = br.readLine()) != null) {
				// result=result.substring(1,2);//result.length()-2
				String[] res = result.split("	");
				// String res1=res[4];
				// String res2=res[5];
				// System.out.print(res.length );
				// res[1]=new String(res[1].getBytes(),"UTF-8");
				// if(res.length==8){
				// fileWriter.write(res[1]+","+res[2]+","+res[3]+","+res[4]+","+res[5]+","+res[6]+","+res[7]+"\r\n");
				// }else{
				//// System.out.println(result);
				// }
				System.out.println(res[0] + ":");
				if (res[0].contains("distant")) {
					dis.append(res[1] + ", ");
				} else if (res[0].contains("hunting")) {
					hunt.append(res[1] + ", ");
				} else if (res[0].contains("waiting")) {
					wait.append(res[1] + ", ");
				}
				countline++;
			}
			System.out.println("done!" + countline);
			fileWriter.write("dis" + dis + "\n");
			fileWriter.write("hunt" + hunt + "\n");
			fileWriter.write("wait" + wait + "\n");

			System.out.println(dis);
			System.out.println(hunt);
			System.out.println(wait);
			fileWriter.close();
		}

	}

}
