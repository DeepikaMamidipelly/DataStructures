package Arrays;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 2, 0, 4, 0, 5, 6 };
	}

	public static void movingAllZeroToEnd(int arr[]) {
		int count=0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != 0) {
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count++;

			}
		}
	}
}
