package mytest;

import java.io.FileNotFoundException;  
import java.io.PrintStream;  
  
public class SayInFile {  
	
	public static void SayInFile(){  
        try {  
            //�ļ�����·��  
            PrintStream ps=new PrintStream("D:\\helloworld.txt");  
            System.setOut(ps);  //�ض�����Ļ�����ps������
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        }  
    }  
    
    public static void main(String[] args) {  
    	SayInFile sif = new SayInFile();
    	sif.SayInFile();
        System.out.println("�����ļ����ˣ�!!!");  
       
    }  
} 
