
package org.tnsif.operator;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner obj1=new Scanner(System.in);
  int num1=obj1.nextInt();
  int num2=obj1.nextInt();
  System.out.println(num1+num2);
  System.out.println(num1-num2);
  System.out.println(num1*num2);
  System.out.println(num1/num2);
  System.out.println(num1%num2);
  obj1.close();
  
	}

}
