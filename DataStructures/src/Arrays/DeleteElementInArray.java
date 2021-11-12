package Arrays;

import java.util.Scanner;

public class DeleteElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {3,2,1,4,6,7};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to deleted from array: "+array);
		int elementToBeDeleted=sc.nextInt();
		
		boolean found=false;
		//deleting and shifting the elements in the array
		for(int i=0;i<array.length;i++) {
			if(array[i]==elementToBeDeleted) {
				found=true;
			}
			if(found) {
				if(i!=array.length-1) {
				array[i]=array[i+1];
				}
			}
			array[array.length-1]=(Integer) null;
		}
		
		System.out.println();
		//printing array after deleting
		for(int i:array) {
			System.out.print(i+" ");
		}
	}

}
