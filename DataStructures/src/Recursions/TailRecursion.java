package Recursions;

import java.util.Scanner;

public class TailRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(func(n) + " ");
		System.out.print(fib(n) + " ");

	}

	static int func(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * func(n - 1);
		} 
	}

	static int fib(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}

	}

}
