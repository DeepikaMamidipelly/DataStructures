package Arrays;

public class InsertandSearch {

	public static void main(String[] args) {
		int[] array = new int[10];
		array[0] = 1;
		array[1] = 3;
		InsertandSearch obj = new InsertandSearch();
		int abc = obj.search(array, array.length, 2);
  
  		// TO DO Auto-generated method stub
                
	 }
   
	public int search(int arr[], int n, int x) {
  	      	  for (int i = 0; i < n; i++) {
  	 	  	if (arr[i] == x) {
  	 	 		return i;
  	 	 	}
  	 	} 
  	 	return -1;
  	}
}
