package Arrays;

public class LeaderInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//An element is said to be leader if all the elements on right side are less than that.
		
		int arr[] = {7,10,4,10,6,5,2}; //O/p: 10,6,5,2
		//int arr[] = {10,20,30}; //---o/p: 30
		//int arr[] = {30,20,10}; //---o/p: 30,20,10
		leaderInArray(arr);
		System.out.println();
		leaderInArraySmartMethod(arr);
	}

	//Naive method time complexity O(n*n)
	public static void leaderInArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			boolean leader=true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<=arr[j]) {
					leader=false;
					break;
				}
			}
			if(leader) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	//solution-2
	public static void leaderInArraySmartMethod(int arr[]) {
		//print from ending because end will always be the leader
		System.out.print(arr[arr.length-1]+" ");
		
		int leader=arr.length-1;
		//last element is printed now start from n-2
	//and check if its value is greater than the currently stored leader...if its greater than obviously
		//it will also be a leader
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>arr[leader]) {
				System.out.print(arr[i]+" ");
				leader=i;
			}
		}
		
	}
	
}
