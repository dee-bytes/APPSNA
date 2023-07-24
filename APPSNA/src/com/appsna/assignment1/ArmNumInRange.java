package com.appsna.assignment1;

import java.util.ArrayList;
import java.util.List;

public class ArmNumInRange {

	public static void main(String[] args) {
		List<Integer> armstrongNumbers = new ArrayList<>();

        for (int num = 100; num <= 999; num++) {
            int temp = num;
            int sumOfDigits = 0;
            int numDigits = String.valueOf(num).length();

            while (temp != 0) {
                int digit = temp % 10;
                sumOfDigits += Math.pow(digit, numDigits);
                temp /= 10;
            }

            if (sumOfDigits == num) {
                armstrongNumbers.add(num);
            }
        }

        System.out.println("Armstrong numbers between 100 and 999:");
        System.out.println(armstrongNumbers);
    }



	}

