package SS;

import java.util.Arrays;

public class recursiveBinarySearch {

	public static void main(String[] args) {
		int [] arr = {5,2,7,4,9,8,6};
		
		Arrays.sort(arr);
		int start = arr[0];
		int end=arr.length;
		int target = 7;
		int result = recurBinarySearch(arr, target, start, end);
		
		System.out.println("The number " + target + " was found at index " + result);
	}
	
	public static int recurBinarySearch(int[] arr, int target, int start, int end) {
		if(start > end) {
			return 0;
		}
		int mid = (start + end) / 2;
		
		if(arr[mid]==target) {
			return mid;
		}
		
		if(arr[mid] < target) {
			return recurBinarySearch(arr, target, mid+1, end);
		}
		else  {
			return recurBinarySearch(arr, target, start, mid-1);
		
		}
		
	}
	 
	

}
