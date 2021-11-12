package Recursions;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("Value:"+func(n));
	}
	static int func(int n) {
		if(n==1) {
			return 1;
		}else {
			return n+func(n-1);
		}
	}

}
