package sk.bernardkaminski.algorithm_performance_test;

import java.util.ArrayList;
import java.util.Random;

import sk.bernardkaminski.bubble_sort.BubbleSort;
import sk.bernardkaminski.insertion_sort.TriedicVkladanim;
import sk.bernardkaminski.merge_sort.TriedicZlucenim;
import sk.bernardkaminski.quick_sort.TriedicQuickSort;
import sk.bernardkaminski.selection_sort.TriedicVyberom;

public class Performance {

	private Stopky stopky = new Stopky();
	private ArrayList<Object> zoznam;
	private int length;

	public Performance() {

	}

	public void addList(ArrayList<Object> zoznam) {
		this.zoznam = zoznam;
	}

	public String result() {
		String result = "";
		for (Object object : zoznam) {
			result += "Cas trvania triedenia s " + object + ":\n" + getResultData(object) + "\n";
		}
		return result;
	}

	private String getResultData(Object object) {
		getElapsedTime(object);
		long uplynulyCas = stopky.getUplynulyCas();
		String result = uplynulyCas + " ns\n";
		result += convertNanosecondsToMilliseconds(uplynulyCas) + " ms\n";
		result += convertNanosecondsToSeconds(uplynulyCas) + " s\n";
		stopky.vynuluj();
		return result;
	}

	private void getElapsedTime(Object object) {
		if (object instanceof TriedicVyberom) {
			stopky.start();
			((TriedicVyberom) object).zotried();
			stopky.stop();
		}
		if (object instanceof TriedicVkladanim) {
			stopky.start();
			((TriedicVkladanim) object).zotried();
			stopky.stop();
		}
		if (object instanceof BubbleSort) {
			stopky.start();
			((BubbleSort) object).zotried();
			stopky.stop();
		}
		if (object instanceof TriedicZlucenim) {
			stopky.start();
			((TriedicZlucenim) object).zotried();
			stopky.stop();
		}
		if (object instanceof TriedicQuickSort) {
			stopky.start();
			((TriedicQuickSort) object).zotried(0, length - 1);
			stopky.stop();
		}
	}

	public int[] randomNumbers(int length, int upperLimit) {
		this.length = length;
		Random generator = new Random();
		int[] data = new int[length];

		for (int i = 0; i < data.length; i++) {
			data[i] = generator.nextInt(upperLimit) + 1;
		}
		return data;
	}

	private String convertNanosecondsToMilliseconds(long input) {
		double ms = (double) input / 1000000;
		return String.format("%.4f", ms);
	}

	private String convertNanosecondsToSeconds(long input) {
		double s = (double) input / 1000000000;
		return String.format("%.7f", s);
	}
}
