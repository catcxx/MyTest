package mytest;

import java.io.*;//����java.io��������нӿڻ���
import java.util.Random;

public class testsj {
public static void main(String[] args) {

    //����Ŀ¼
	String path = "d:/a";
	File f = new File(path);
	if (!f.exists()) {
		f.mkdirs();
		}

   //�����ļ�
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

	//��ȡ�ļ���
	FileWriter fw;
	try {

		fw = new FileWriter(file, true);//д���ַ����ļ�,�������е����ݺ͸����ڸ��ļ���ĩβ�������ݡ�
		BufferedWriter bw = new BufferedWriter(fw);//���ļ�������һ���ַ�����������ڽ�������е�����д�뵽�ļ��С�
		for(int i = 0;file.length()<100;i++){

		n = random.nextInt();
		bw.write(""+n);
		bw.newLine();
		bw.flush(); //�����ݸ������ļ�
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

