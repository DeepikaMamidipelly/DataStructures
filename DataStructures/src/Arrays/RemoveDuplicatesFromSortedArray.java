package Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 20, 30, 30, 30 };
		removeDuplicates(arr);
		
	}

	public static void removeDuplicates(int arr[]) {
		int initial=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[initial-1]) { //Itr-1:10 and 20 not equal(initial++ which becomes 2)-we copy 20 to 20 only
				arr[i]=arr[initial];     //Itr-2:20 and 20 are same..skips if condition
				initial++;               //Itr-3:30 and 20 are not same increments intital and places 30 in before intital index which is 2
			}
		}
	}
}
