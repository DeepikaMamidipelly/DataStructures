package Arrays;

public class CheckAscSortedWithEqualAllowed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,10};
		boolean sorted=true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				sorted=false;
				break;
			}
		}
		
		if(sorted) {
			System.out.print("Sorted Array in Ascending Order");
		}else {
			System.out.print("UnSorted Array in Ascending Order");
		}
	}

}
