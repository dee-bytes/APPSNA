package com.appsna.assignment1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int number= sc.nextInt();
		
		if(isArmstrongNumber(number)) {
			System.out.println(number + " is an Armstrong Number.");
		}else {
			System.out.println(number + " is not an Armstrong number." );
		}
			
		}
	public static boolean isArmstrongNumber(int number) {
		int originalNumber= number;
		int numberOfDigits= String.valueOf(number).length();
		int sum=0;
		
		while(number>0) {
			int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
		}
		return sum== originalNumber;
	}

}
