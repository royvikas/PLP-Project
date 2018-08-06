package org.cap.demo;


/**
 * 
 * @author Shivani Katolkar
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = null;
		   ConversionClass obj = null;
		   try {
		      obj = new ConversionClass();
		      scan = new Scanner(System.in);
		      System.out.print("Enter the number you want to convert into words : ");
		      System.out.println("Number in word   : " +obj.convert(scan.nextInt()) + " only");
		   } catch(InputMismatchException e) {
		      System.out.println("Please enter numbers only...!!");
		   } catch(Exception e1) {
		      e1.printStackTrace();
		   } finally {
		      if(null != scan) {
		         scan.close();
		      }
		   }

	}

}
