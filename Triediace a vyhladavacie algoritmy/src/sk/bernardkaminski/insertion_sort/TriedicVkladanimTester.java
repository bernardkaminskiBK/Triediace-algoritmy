package sk.bernardkaminski.insertion_sort;

import java.util.Arrays;

public class TriedicVkladanimTester {

	public static void main(String[] args) {
		int[] data = PoleUtil.generatorRandomCisel(1000, 10000);
		System.out.println("Nezotriedene pole: " + Arrays.toString(data));

		TriedicVkladanim triedic = new TriedicVkladanim(data);
		Stopky stopky = new Stopky();
		stopky.start();
		triedic.zotried();
		stopky.stop();
		System.out.println("Zotriedene pole: " + Arrays.toString(data));
		System.out.println("Cas: " + stopky.getUplynulyCas() + " ms");

	}

}
