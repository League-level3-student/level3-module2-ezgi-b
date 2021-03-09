package _00_Intro_to_Sorting_Algorithms;

class _02_SwappingDigits {

    // 1. Complete the method so that the first two elements of the array are
    //    swapped.
    public static void swapArrayOfTwo(int[] arr) {
    	int temp = arr[0];
    	arr[0] = arr[1];
    	arr[1] = temp;
    }

    // 2. Complete the method so that it sorts the array using a bubble sort.
    //    Iterate through the array and when you find two elements that are out
    //    of order, swap them. Repeat this until the array is in order.
    public static void sortIntArray(int[] arr) {
    	boolean sorted = false;
    	while(sorted==false) {
    		sorted = true;
    		for(int i = 0; i < arr.length-1; i++) {
    			if(arr[i] > arr[i+1]) {
    				int temp = arr[i];
    		    	arr[i] = arr[i+1];
    		    	arr[i+1] = temp;
    		    	sorted = false;
    			}
    		}
    	}
    }

    // 3. Complete the method so that it finds the middle number in the array.
    //    *Hint* it helps to sort it first.
    //    *Double Hint* Use the method you already wrote in step 2 to sort it
    public static int findMiddle(int[] arr) {
    	sortIntArray(arr);
        return arr[arr.length/2];
    }
}
