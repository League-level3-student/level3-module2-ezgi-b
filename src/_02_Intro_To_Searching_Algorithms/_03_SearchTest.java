package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String[] arr = {"orange", "yellow" , "purple", "sparrow", "parrot"};
    	
        assertEquals(_01_LinearSearch.linearSearch(arr, "red"), -1);
        assertEquals(_01_LinearSearch.linearSearch(arr, "orange"), 0);
        assertEquals(_01_LinearSearch.linearSearch(arr, "parrot"), arr.length-1);
        assertEquals(_01_LinearSearch.linearSearch(arr, "purple"), 2);
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        assertEquals(_02_BinarySearch.binarySearch(arr, 0, arr.length-1, 19), -1);
        assertEquals(_02_BinarySearch.binarySearch(arr, 0, arr.length-1, 11), 10);
        assertEquals(_02_BinarySearch.binarySearch(arr, 0, arr.length-1, 17), 16);
    }
}
