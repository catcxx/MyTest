package mytest;

import java.io.*;//导入java.io包里的所有接口或类
import java.util.Random;

public class testsj {
public static void main(String[] args) {

    //创建目录
	String path = "d:/a";
	File f = new File(path);
	if (!f.exists()) {
		f.mkdirs();
		}

   //创建文件
	String fileName="test.txt";
	File file = new File(f,fileName);

	if(!file.exists()){
		try {
			
			file.createNewFile();

		} catch (IOException e) {
// TODO Auto-generated catch block
	e.printStackTrace();
	}
}

	Random random = new Random();
	int n;

	//获取文件流
	FileWriter fw;
	try {

		fw = new FileWriter(file, true);//写入字符到文件,保留现有的内容和附加在该文件的末尾的新内容。
		BufferedWriter bw = new BufferedWriter(fw);//对文件构造了一个字符输出流，用于将输出流中的数据写入到文件中。
		for(int i = 0;file.length()<100;i++){

		n = random.nextInt();
		bw.write(""+n);
		bw.newLine();
		bw.flush(); //将数据更新至文件
		System.out.println("==========="+file.length()+"========"+n);
	}
	bw.close();
	fw.close();

} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}


}

}

