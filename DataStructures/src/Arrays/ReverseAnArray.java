package Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 9, 5, 4, 2, 12 };
		reversePrintingArray(arr);
		System.out.println();
		reverseElementsInArray(arr);
	}

	public static void reversePrintingArray(int arr[]) {
		System.out.println("Reverse printing elements in array:");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	
	public static void reverseElementsInArray(int arr[]) {
		for(int i=0,j=arr.length-1;i<j;i++,j--) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		System.out.println("Printing after reversing elements in array:");
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
