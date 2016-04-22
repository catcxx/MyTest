package mytest;

import java.util.Date;

public class testhour {
	public static void main( String[] args ) {
	    Date date = new Date();
	    System.out.println( date.getHours() );
	 
	    while (true) {
	        while ( date.getHours() == 12 ) {
	            if ( date.getMinutes() == 0) {
	                if (date.getSeconds() == 0 ) {
	                    System.out.println("hello world !");
	                }
	            }
	        }
	    }
	}
}
