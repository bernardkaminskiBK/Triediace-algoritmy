package sk.bernardkaminski.selection_sort;

import java.util.Arrays;

public class TriedicVyberomTester {

	public static void main(String[] args) {

		int[] data = PoleUtil.generatorRandomCisel(10, 10);
		System.out.println("Nezotriedene pole: " + Arrays.toString(data));

		TriedicVyberom triedic = new TriedicVyberom(data);
		triedic.zotried();
		System.out.println("Zotriedene pole: " + Arrays.toString(data));

	}

}
