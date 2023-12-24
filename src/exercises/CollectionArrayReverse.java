package exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CollectionArrayReverse {

	public static void main(String[] args) {
		/*
		 * Make a program who ask numbers, and make an Array, after this, he show the
		 * reverse array.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how much numbers do you want to Insert: ");
		int n = sc.nextInt();
		Integer[] array = new Integer[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the " + (i + 1) + " º number: ");
			array[i]= sc.nextInt();
		}
		
		Collections.reverse(Arrays.asList(array));
		
		System.out.println(Arrays.toString(array));

		sc.close();

	}

}
