package Arrays;

public class LeftRotateArrayByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,4,3,2};
		leftRotateByOne(arr);

	}
	
	public static void leftRotateByOne(int arr[]) {
		int index0=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=index0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	

}
