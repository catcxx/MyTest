package mytest;
/**
 * 处理文本文件
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Testfile {
	public static void main(String[] args) throws IOException
	{
		//File f1= new File("D:\\SogouQ.reduced");
		File f1= new File("E:\\xiantaxigpsoracledata\\2011-06-13.txt");//     C://Users//Administrator//Desktop//Result.txt
		FileWriter fileWriter=new FileWriter("E:\\xiantaxigpsoracledata\\2011-06-130.txt");
		BufferedReader br = new BufferedReader(new FileReader(f1));//构造一个BufferedReader类来读取文件
		String result=" ";
		//String[] res={null,null,null,null,null,null,null,null,null};
		int countline=0;
		while((result=br.readLine())!=null)
		{
			//	result=result.substring(1,2);//result.length()-2
				String[] res=result.split(",");
				//String res1=res[4];
			//	String res2=res[5];
				//System.out.print(res.length );
//				res[1]=new String(res[1].getBytes(),"UTF-8");
				if(res.length==8){
					fileWriter.write(res[1]+","+res[2]+","+res[3]+","+res[4]+","+res[5]+","+res[6]+","+res[7]+"\r\n");
				}else{
//					System.out.println(result);
				}
				
				countline++;		
		}
		System.out.println("done!"+countline);
		fileWriter.close();
	}	
}
