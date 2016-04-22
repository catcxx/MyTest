

//gps->latlng

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class test3 {

	private static String[] str1s;

	public static void main(String[] args) throws IOException {
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\Test\\jps.txt"));
			
			String  st = "";
		
			while((st = br.readLine())!=null){
				prase(st);
				
			}
			} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	private static void prase(String st) throws IOException {
		Pattern  P = Pattern.compile("([\\d]+\\.[\\d]+)");
		Matcher  m = P.matcher(st);
		File file=new File("D:\\Test\\latlng.txt");
		BufferedWriter bf=new BufferedWriter(new PrintWriter(file));
		while(m.find()){
			
			System.out.println(m.group());
			bf.write("m.group()"+m.group());
		
		}

//		bf.close();
	}

}
