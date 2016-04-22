package mytest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileCount {
	private static final int ONE=1;
	public static void main(String[] args){
	    Map m = new HashMap();
	    int b=0;
	    FileReader fis;
	    try {
	         fis = new FileReader("F:\\java\\myword.txt");//在你电脑的f盘建一个java文件夹，文件夹中建一个myword.txt文件，里面写汉字
	        while( (b=fis.read())!=-1){
	            Integer freq = (Integer)m.get((char)b);
	            m.put((char)b,(freq==null?ONE:new Integer(freq.intValue()+1)));
	        }
	    } catch (FileNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	    System.out.println(m.size()+"------");
	    System.out.println(m);
	}
}
