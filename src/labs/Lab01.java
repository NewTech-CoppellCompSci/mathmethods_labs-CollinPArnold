package labs;

import java.util.Scanner;
import java.lang.Math;


public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner p1 = new Scanner(System.in);
		System.out.print("Enter a positive integer : ");
		int input1 = p1.nextInt();
		System.out.print("Enter an exponent : ");
		int input2 = p1.nextInt();
		
		int mth = (int) Math.pow(input1, input2);
		
		System.out.println(input1 + "^" + input2 + " = " + mth);
		System.out.println("");
		
		
	}
	
	
	
	
	public static void problem02() {
		Scanner p2 = new Scanner(System.in);
		System.out.print("Enter a positive integer : ");
		int input = p2.nextInt();
		double sqr = Math.pow(input, 0.5);
		
		System.out.println("The square root of " + input + " is " + sqr);
		System.out.println("");
		
	}

	
	

	public static void problem03() {
		Scanner p3 = new Scanner(System.in);
		System.out.print("Length of side A : ");
		double sideA = p3.nextDouble();
		
		System.out.print("Length of side B : ");
		double sideB = p3.nextDouble();
		
		double sqA = sideA * sideA;
		double sqB = sideB * sideB;
		
		double hypoSq = sqA + sqB;
		double hypo = Math.pow(hypoSq, 0.5);
		
		System.out.println("Hypothenuse = " + hypo);
		System.out.println("");

	}


	
	
	public static void problem04() {
		Scanner p4 = new Scanner(System.in);
		int input = 1;
		int max = 0; int min = 0;
		
		while (input != 0) {
			System.out.print("Enter a positive integer : ");
			input = p4.nextInt();
			if (input == 0) {
				break;
			}
			if (input >= max) {
				max = input;
			} else if (input <= min) {
				min = input;
			}
			
		}
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		
	}
	
	
	
	
	
	
}
