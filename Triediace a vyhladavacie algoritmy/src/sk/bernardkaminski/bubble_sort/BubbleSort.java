package sk.bernardkaminski.bubble_sort;

public class BubbleSort {

	private int[] data;

	public BubbleSort(int[] data) {
		this.data = data;
	}

	public void zotried() {
		int n = data.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (data[j] > data[j + 1]) {
					int zaloha = data[j];
					data[j] = data[j + 1];
					data[j + 1] = zaloha;
				}
			}
		}
	}

	@Override
	public String toString() {
		return "BubbleSort";
	}

}
