package mytest;

import java.io.FileNotFoundException;  
import java.io.PrintStream;  
  
public class SayInFile {  
	
	public static void SayInFile(){  
        try {  
            //文件生成路径  
            PrintStream ps=new PrintStream("D:\\helloworld.txt");  
            System.setOut(ps);  //重定向屏幕输出到ps对象中
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        }  
    }  
    
    public static void main(String[] args) {  
    	SayInFile sif = new SayInFile();
    	sif.SayInFile();
        System.out.println("我在文件里了！!!!");  
       
    }  
} 
