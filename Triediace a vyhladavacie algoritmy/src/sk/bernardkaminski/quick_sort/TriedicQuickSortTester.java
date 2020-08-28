package sk.bernardkaminski.quick_sort;

import java.util.Arrays;

public class TriedicQuickSortTester {

	public static void main(String[] args) {

		int[] data = { 10, 2, 5, 7, 8, 1, 4, 3, 6, 9 };

		TriedicQuickSort triedic = new TriedicQuickSort(data);
		triedic.zotried(0, 9);

		System.out.println("Zotriedene pole s quick sortom :\n" + Arrays.toString(data));

		// TODO: tu som prestal 1:38:29

	}

}
