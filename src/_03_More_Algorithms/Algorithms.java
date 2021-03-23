package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return num1 + " x " + num2 + " = " + (num1*num2);
    }
    
    public static int findBrokenEgg(List<String> eggs) {
    	for(int i = 0; i<eggs.size(); i++) {
    		if(eggs.get(i).equals("cracked")) return i;
    	}
        return -1;
    }
    
    public static boolean isPrime(int n) {
    	for(int i = 2; i<n; i++) {
    		if(n%i==0) return false;
    	}
    	return true;
    }
    
    public static boolean isSquare(int n) {
    	for(int i = 1; i<(int) Math.sqrt(n)+1; i++) {
    		if(i*i==n) return true;
    	}
    	return false;
    }
    
    public static boolean isCube(int n) {
    	for(int i = 1; i<=n; i++) {
    		if((i*i*i)==n) return true;
    	}
    	return false;
    }

	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for(Boolean b: oysters) {
			if(b) count++;
		}
		return count;
	}

	public static double findTallest(List<Double> peeps) {
		int idx = 0;
		for(int i = 1; i<peeps.size(); i++) {
			if(peeps.get(idx)<peeps.get(i)) idx = i;
		}
		return peeps.get(idx);
	}

	public static String findLongestWord(List<String> words) {
		int idx = 0;
		for(int i = 1; i<words.size(); i++) {
			if(words.get(idx).length()<words.get(i).length()) idx = i;
		}
		return words.get(idx);
	}

	public static boolean containsSOS(List<String> message1) {
		for(int i = 0; i<message1.size(); i++) {
			if(message1.get(i).contains("... --- ...")) return true;
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		List<Double> output = results;
		for(int i = 1; i<output.size(); i++) {
			int j = i;
			while(j>=0&&output.get(i)<=output.get(j)) {
				j--;
			}
			output.add(j+1, output.get(i));
			output.remove(i+1);
		}
		return output;
	}
}
