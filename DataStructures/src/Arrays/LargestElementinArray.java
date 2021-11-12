package Arrays;

public class LargestElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,5,20,8};
		
		int maximum=arr[0];
		int maximumIndex=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>maximum) {
				maximum=arr[i];
				maximumIndex=i;
			}
		}
		
		System.out.print("Maximum Element is: "+maximum+" Found at Index: "+maximumIndex);
//Time complexitiy is O(n)  which is both best and worst
	}

}
