package Recursions;

import java.util.Scanner;

public class Print1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		func(1, n);
		func(n);

	}

	static void func(int i, int n) {
		if (i > n) {
			return;
		} else {
			System.out.print(i + " ");
			func(i + 1, n);
		}
	}
	
	static void func(int n) {
		if(n==0) {
			return;
		}else {
			func(n-1);
			System.out.print(n+" ");
		}
	}
}
