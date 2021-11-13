package Arrays;

public class LeftRotateArrayByD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 4, 5, 2, 9, 12, 13 };
		System.out.println("Before rotating");
		print(arr);
		rotateArray(arr,2);
	}

	public static void rotateArray(int arr[],int d) {
		
		reverse(arr,0,d-1);
		System.out.println("After reversing from 0 to d elements");
		print(arr);
		
		reverse(arr,d,arr.length-1);
		System.out.println("After reversing from d to last elements");
		print(arr);
		
		reverse(arr,0,arr.length-1);
		System.out.println("After reversing from 0 to last elements");
		print(arr);
	}

	public static void reverse(int arr[],int i,int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;j--;
		}
	}
	
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
