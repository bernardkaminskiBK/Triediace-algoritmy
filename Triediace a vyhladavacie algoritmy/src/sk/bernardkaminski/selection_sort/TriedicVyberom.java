package sk.bernardkaminski.selection_sort;

public class TriedicVyberom {

	private int[] data;

	public TriedicVyberom(int[] data) {
		this.data = data;
	}

	public void zotried() {
		for (int i = 0; i < data.length - 1; i++) {
			int minPrvok = najdiMinPrvokOdIndexu(i);
			vymenPrvky(minPrvok, i);
		}
	}

	private void vymenPrvky(int indexI, int indexJ) {
		int zaloha = data[indexI];
		data[indexI] = data[indexJ];
		data[indexJ] = zaloha;

	}

	private int najdiMinPrvokOdIndexu(int indexMinPrvok) {
		int minPrvok = indexMinPrvok;
		for (int i = minPrvok + 1; i < data.length; i++) {
			if (data[i] < data[minPrvok]) {
				minPrvok = i;
			}
		}
		return minPrvok;
	}

	@Override
	public String toString() {
		return "TriedicVyberom";
	}

}
