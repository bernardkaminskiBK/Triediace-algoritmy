package sk.bernardkaminski.quick_sort;

public class TriedicQuickSort {

	private int[] data;

	public TriedicQuickSort(int[] data) {
		this.data = data;
	}

	public void zotried(int indexOd, int indexDo) {
		if (indexOd >= indexDo) {
			return;
		}

		int indexPivota = zvolIndexPivota(indexOd, indexDo);
		zotried(indexOd, indexPivota);
		zotried(indexPivota + 1, indexDo);
	}

	private int zvolIndexPivota(int indexOd, int indexDo) {
		int pivot = data[indexOd];
		int i = indexOd - 1;
		int j = indexDo + 1;

		while (i < j) {
			i++;
			while (data[i] < pivot) {
				i++;
			}
			j--;
			while (data[j] > pivot) {
				j--;
			}
			if (i < j) {
				vymenPrvky(i, j);
			}
		}
		return j;
	}

	private void vymenPrvky(int i, int j) {
		int zaloha = data[i];
		data[i] = data[j];
		data[j] = zaloha;
	}

	@Override
	public String toString() {
		return "TriedicQuickSort ";
	}

}
