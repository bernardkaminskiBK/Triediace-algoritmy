package sk.bernardkaminski.insertion_sort;

import java.util.Random;

public class PoleUtil {

	private static Random generator = new Random();

	public static int[] generatorRandomCisel(int dlzka, int hornaHranica) {
		int[] data = new int[dlzka];
		for (int i = 0; i < data.length; i++) {
			data[i] = generator.nextInt(hornaHranica) + 1;
		}
		return data;
	}
}
