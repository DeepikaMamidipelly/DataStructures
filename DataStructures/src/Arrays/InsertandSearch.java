package Arrays;

public class InsertandSearch {

	public static void main(String[] args) {
		int[] array = new int[10];
		array[0] = 1;
		array[1] = 3;
		array[3] = 2;
		InsertandSearch obj = new InsertandSearch();
		int elementFound= obj.search(array, array.length, 2);
		if(elementFound!=-1) {
			System.out.print("Element found at"+elementFound);
		}else {
			System.out.print("Element Not found");
		}
  
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
	
	public void insert(int array[],int position,int element) {
		for(int i=array.length-1;i>=position;i--) {
			array[i+1]=array[i];
		}
		array[position]=element;
	}
}
