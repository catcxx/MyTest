package testfile;

import java.io.*;

public class TestObjectOutputStream {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    // Create an output stream for file object.dat
    ObjectOutputStream output =
      new ObjectOutputStream(new FileOutputStream("object.dat"));

    // Write a string, double value, and object to the file
    output.writeUTF("John");
    output.writeDouble(85.5);
    output.writeObject(new java.util.Date());
    
    ObjectInputStream input =
    	      new ObjectInputStream(new FileInputStream("object.dat"));

    	    // Write a string, double value, and object to the file
    	    String name = input.readUTF();
    	    double score = input.readDouble();
    	    java.util.Date date = (java.util.Date)(input.readObject());
    System.out.println(name + " " + score + " " + date);
    // Close output stream
    output.close();
  }
}

