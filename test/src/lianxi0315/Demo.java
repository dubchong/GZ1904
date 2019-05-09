package lianxi0315;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double sum = 0;
		double a = 0;
		
		for (double i = 1; i <= n; i++) {
			a = (1/i);
			//a=i;
			sum=a+sum;
		}
		
		System.out.println(sum);
		
	}
}
