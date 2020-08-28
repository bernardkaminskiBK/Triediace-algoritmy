package sk.bernardkaminski.bubble_sort;

import java.util.Arrays;

public class BubbleSortTester {

	public static void main(String[] args) {
		int[] data = PoleUtil.generatorRandomCisel(20, 100);
		System.out.println("Nezotriedene pole: " + Arrays.toString(data));

		BubbleSort triedic = new BubbleSort(data);

		Stopky stopky = new Stopky();
		stopky.start();
		triedic.zotried();
		stopky.stop();

		long vysledok = stopky.getUplynulyCas();
		System.out.println("Zotriedene pole s bubble sortom: " + Arrays.toString(data));
		System.out.println("\nCas trvanie zotriedenie v nanosekundach: " + vysledok + " ns");
		System.out.println(
				"Cas trvanie zotriedenie v milisekundach: " + stopky.convertNanosecondsToMiliseconds(vysledok) + " ms");
		System.out
				.println("Cas trvanie zotriedenie v sekundach: " + stopky.convertNanosecondsToSeconds(vysledok) + " s");
	}

}
