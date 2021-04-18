package interviewVorbereitung;

import java.util.Arrays;

public class _07_CompareTwoArray {

	public static void main(String[] args) {
		int[] num1 = { 12, 23, 2, 78 };
		int[] num2 = { 2, 12, 23, 78 };

		Arrays.sort(num1);
		Arrays.sort(num2);
		
		System.out.println("iki array ayni mi:"+ ayniMi(num1, num2));

		System.out.println("23 sayisinin indexi:"+Arrays.binarySearch(num1, 23));

		
		int[] score = { 5, 56, 23, 70, 3 };
		score = Arrays.copyOf(score, 7);
		
		arrayYazdir(score);
		
		score[5]=54;
		score[6]=34;
		
		
		arrayYazdir(score);

	}

	public static boolean ayniMi(int[] num1, int[] num2) {

		for (int i = 0; i < num1.length; i++) {
			if (num1[i] != num2[i])
				return false;
		}

		return true;
	}
	
	public static void arrayYazdir(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
