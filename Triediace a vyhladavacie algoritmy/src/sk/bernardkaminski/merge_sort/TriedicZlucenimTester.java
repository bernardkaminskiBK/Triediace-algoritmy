package sk.bernardkaminski.merge_sort;

import java.util.Arrays;

public class TriedicZlucenimTester {

	public static void main(String[] args) {

		int[] data = { 2, 4, 6, 10, 7, 1, 3, 5, 9, 8 };

		TriedicZlucenim triedic = new TriedicZlucenim(data);
		triedic.zotried();

		System.out.println(Arrays.toString(data));

	}

}
