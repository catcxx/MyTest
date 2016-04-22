package testgps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetStrrr {

	public static void main(String[] args) throws IOException {

//		File filelist = new File("F:\\sparkshare\\getstratege\\startandend\\start\\1.txt");
		File filelist = new File("G:\\1.csv");
//		File filelist = new File("G:\\start13");
		//F:\sparkshare\getstratege\startandend\start\13
		FileWriter fileWriter=new FileWriter("F:\\sparkshare\\getstratege\\startandend\\end\\13\\baidu");//20wid
//		String[] file = filelist.list();
//		System.out.println(file.length);
//		for(int i = 0; i < file.length; i++){
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filelist),"UTF-8"));//构造一个BufferedReader类来读取文件
		
		String result="";
		String result2="";
		int countline=0;
		while((result=br.readLine())!=null)
		{
			//	result=result.substring(1,2);//result.length()-2
				String[] res=result.split(",");

				
//				if(res[1].equals("start")){
////					fileWriter.write(res1[3]+" "+res1[4]+" "+res[1]+"\n");
////					System.out.println(res[1]);
//					System.out.println(res[1]);
//				}
				    
//					fileWriter.write(result+","+n+"\n");
				if(res.length==2){
					System.out.println("{\"lng\":"+res[0]+",\"lat\":"+res[1]+",\"count\":"+1+"},");
//					{"lng":116.418261,"lat":39.921984,"count":50},
//					fileWriter.write("{\"lng\":"+res[0]+",\"lat\":"+res[1]+",\"count\":"+1+"},"+"\n");
					countline++;	
				}
					
		}
//		System.out.println("done!"+countline);
		fileWriter.close();
	}	
//	}


}
