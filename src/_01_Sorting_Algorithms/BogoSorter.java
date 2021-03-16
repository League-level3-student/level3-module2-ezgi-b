package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
    	while(!inOrder(array)) {
    		int rand = (int)(Math.random() * array.length);
    		int rand2 = (int)(Math.random() * array.length);
    		int temp = array[rand];
    		array[rand] = array[rand2];
    		array[rand2] = temp;
    		display.updateDisplay();
    	}
    }
    
    boolean inOrder(int[] arr) {
    	for(int i = 0; i < arr.length - 1; i++) {
    		if(arr[i] > arr[i+1]) return false;
    	}
    	return true;
    }
}
