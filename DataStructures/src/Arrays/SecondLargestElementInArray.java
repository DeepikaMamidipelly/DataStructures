/**
 * 
 */
package Arrays;

/**
 * @author Deepika Raj
 *
 */
public class SecondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 10, 10, 9};
		int largest = 0, secondLargest = -1;
		for (int i = 1; i < arr.length; i++) {
			
			//this is for different elements in an array
			if (arr[i] > arr[largest]) {
				secondLargest = largest;
				largest = i;
			}
			
			//if same elements that means secondlargest will always be -1 initially
			else if(arr[i]!=arr[largest]) {
				
				//if secondLargest s -1 change it or else check the condition
				if(secondLargest==-1 || arr[secondLargest]<arr[i]) {
					secondLargest=i;
				}	
			}
		}
		
		if(secondLargest!=-1) {
		System.out.print("Second Largest:"+arr[secondLargest]);
		}else {
			System.out.print("No second Largest Element");
		}
	}

}
