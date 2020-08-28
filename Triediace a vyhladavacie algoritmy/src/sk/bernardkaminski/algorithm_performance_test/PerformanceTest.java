package sk.bernardkaminski.algorithm_performance_test;

import java.util.ArrayList;

import sk.bernardkaminski.bubble_sort.BubbleSort;
import sk.bernardkaminski.insertion_sort.TriedicVkladanim;
import sk.bernardkaminski.merge_sort.TriedicZlucenim;
import sk.bernardkaminski.quick_sort.TriedicQuickSort;
import sk.bernardkaminski.selection_sort.TriedicVyberom;

public class PerformanceTest {

	public static void main(String[] args) {

		Performance performance = new Performance();
		int[] data = performance.randomNumbers(10, 100);

		ArrayList<Object> zoznam = new ArrayList<Object>();
		zoznam.add(new BubbleSort(data));
		zoznam.add(new TriedicVkladanim(data));
		zoznam.add(new TriedicVyberom(data));
		zoznam.add(new TriedicZlucenim(data));
		zoznam.add(new TriedicQuickSort(data));

		performance.addList(zoznam);
		String result = performance.result();
		System.out.println(result);

	}

}
