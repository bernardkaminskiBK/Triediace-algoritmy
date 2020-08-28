package sk.bernardkaminski.merge_sort;

public class TriedicZlucenim {

	private int[] data;

	public TriedicZlucenim(int[] data) {
		this.data = data;
	}

	public void zotried() {
		if (data.length <= 1) {
			return;
		}

		int[] lavaCast = new int[data.length / 2];
		int[] pravaCast = new int[data.length - lavaCast.length];

		System.arraycopy(data, 0, lavaCast, 0, lavaCast.length);
		System.arraycopy(data, lavaCast.length, pravaCast, 0, pravaCast.length);

		TriedicZlucenim triedicLavaCast = new TriedicZlucenim(lavaCast);
		TriedicZlucenim triedicPravaCast = new TriedicZlucenim(pravaCast);

		triedicLavaCast.zotried();
		triedicPravaCast.zotried();

		zluc(lavaCast, pravaCast);
	}

	private void zluc(int[] lavaCast, int[] pravaCast) {
		int indexLavaCast = 0;
		int indexPravaCast = 0;
		int i = 0;

		while (indexLavaCast < lavaCast.length && indexPravaCast < pravaCast.length) {
			if (lavaCast[indexLavaCast] < pravaCast[indexPravaCast]) {
				data[i] = lavaCast[indexLavaCast];
				indexLavaCast++;
			} else {
				data[i] = pravaCast[indexPravaCast];
				indexPravaCast++;
			}
			i++;
		}
		System.arraycopy(lavaCast, indexLavaCast, data, i, lavaCast.length - indexLavaCast);
		System.arraycopy(pravaCast, indexPravaCast, data, i, pravaCast.length - indexPravaCast);
	}

	@Override
	public String toString() {
		return "TriedicZlucenim";
	}

}
