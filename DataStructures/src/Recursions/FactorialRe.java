package Recursions;

import java.util.Scanner;

public class FactorialRe {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		recurs(n);
		
		
		
	}
	static void recurs(int n) {
		if(n==0) {
			return;
		}else {
			System.out.print(n+" ");
			recurs(n-1);
		}
		
	}
}
