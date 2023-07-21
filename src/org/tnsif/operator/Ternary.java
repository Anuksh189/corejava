package org.tnsif.operator;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter the number");
       int num=sc.nextInt();
       String res=(num%2==0)?"Even":"odd";
       System.out.println("Result is:"+res);
       sc.close();
	}

}
