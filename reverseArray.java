import java.util.Arrays;
class reverseArray{
	public static void main(String[] args) {
		int arr []={1,2,3,4,5,6};

		System.out.print("Orignal Arrray");
		for (int i = 0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+" ");
		}

		System.out.print("Reverse Array");
		for (int i = arr.length-1;i>=0 ;i-- ) {
			System.out.print(arr[i]+" ");
			
		}
	}
}