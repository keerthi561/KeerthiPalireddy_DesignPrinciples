package com.epam.Calculator;

import java.util.Scanner;

public class calci {
	static Operation x;
	public static boolean setFlag(char ch) {
		boolean flag;
		if(ch == 'y'||ch=='Y')
			flag = true;
		else {
			flag = false;
			System.out.println("Thank you for using this Calculator!");
		}
		return flag;
	}
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean flag=true;
		try {
			while(flag) {
				System.out.print("Enter first number : ");
				int n1 =sc.nextInt();
				System.out.print("Enter second number : ");
				int n2 =sc.nextInt();
				System.out.println("Select the operation to be performed:\nADD(+)\nSUBTRACT(-)\nMULTIPLY(*)\nDIVIDE(/)");
				char operation = sc.next().charAt(0);
				int result;
				switch(operation) {
				case '+':
					System.out.print("Sum : ");
					x = new Addition();
					System.out.println(x.op(n1, n2));
					break;
				case '-':
					System.out.print("Difference : ");
					x = new Subtraction();
					System.out.println(x.op(n1, n2));
					break;
				case '*':
					System.out.print("Product : ");
					x = new Multiplication();
					System.out.println(x.op(n1, n2));
					break;
				case '/':
					System.out.print("Quotient : ");
					x = new Division();
					System.out.println(x.op(n1, n2));
					break;
				default:
					System.out.print("Please enter a valid input");
				}
				System.out.println("\nDo you want to perform more operations?(y/n)");
				flag = setFlag(sc.next().charAt(0));
			}
		} 
		catch(Exception e) {
			System.out.println("Error Occured");
			e.printStackTrace();
		}
	}
}
