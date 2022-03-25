package labs;

import java.util.Scanner;
import java.lang.Math;


public class Lab02 {

	public static void main(String[] args) {
		
		//problem01();
		//problem02();
		//problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner p2 = new Scanner(System.in);
		System.out.print("Enter a positive integer : ");
		int max = p2.nextInt();
		System.out.print("Enter another positive integer : ");
		int min = p2.nextInt();
		int t = 0;
		
		
		for (int i = 1; i < 10; i++) {
			if (max > min) {
				t =  min + (int)(Math.random() * ((max - min) + 1));
			} else if (min > max) {
				t =  max + (int)(Math.random() * ((min - max) + 1));
			} else if (max == min) {
				System.out.println("Hey wait... Those numbers are equal");
				break;
			}
			
			System.out.print(t +  " ");
		}
		
		System.out.println("");
		
	}
	
	
	
	
	public static void problem02() {
		Scanner p3 = new Scanner(System.in);
		System.out.print("Enter the radius of the cylinder : ");
		double radius = p3.nextInt();
		double circle = radius * radius * Math. PI;
		
		System.out.print("Enter the height of the cylinder : ");
		double height = p3.nextInt();
		
		double cyl = circle * height;
		
		System.out.println(cyl);
		System.out.println("");
		
	}

	
	

	public static void problem03() {
		Scanner p4 = new Scanner(System.in);
		System.out.print("Enter x1 : ");
		double x1 = p4.nextDouble();
		System.out.print("Enter y1 : ");
		double y1 = p4.nextDouble();
		
		System.out.print("Enter x2 : ");
		int x2 = p4.nextInt();
		System.out.print("Enter y2 : ");
		int y2 = p4.nextInt();
		
		double x = x2 - x1;
		double xsq = Math.pow(x, 2);
		
		double y = y2 - y1;
		double ysq = Math.pow(y, 2);
		
		double xy = xsq + ysq;
		
		double d = Math.pow(xy, 0.5);
		
		System.out.println("Distance between point " + d);
		
		
		
	}


	
	
	public static void problem04() {
		//Ax^2 + Bx + C = 0
		
		Scanner p5 = new Scanner(System.in);
		System.out.print("Enter a-value : ");
		double a = p5.nextDouble();
		System.out.print("Enter b-value : ");
		double b = p5.nextDouble();
		System.out.print("Enter c-value : ");
		double c = p5.nextDouble();
		
		double NB = b * -1;
		
		double b2 = b * b;
		double fourAC = 4 * a * c;
		double inside = b2 - fourAC;
		double sr = Math.pow(inside, 0.5);
		double top = NB + sr;
		double bottom = 2 * a;
		double all = top / bottom;
		
		System.out.println("x1 = " + all);
		
		b2 = b * b;
		fourAC = 4 * a * c;
		inside = b2 - fourAC;
		sr = Math.pow(inside, 0.5);
		top = NB - sr;
		bottom = 2 * a;
		all = top / bottom;
		System.out.println("x2 = " + all);
		
	}
	
	

	
}
