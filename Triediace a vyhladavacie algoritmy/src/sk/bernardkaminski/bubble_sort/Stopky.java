package sk.bernardkaminski.bubble_sort;

public class Stopky {

	private boolean suSpustene;
	private long casSpustenia;
	private long uplynulyCas;

	public Stopky() {
		vynuluj();
	}

	public void start() {
		if (suSpustene) {
			return;
		}
		suSpustene = true;
		casSpustenia = System.nanoTime();
	}

	public void stop() {
		if (!suSpustene) {
			return;
		}
		suSpustene = false;
		long casZastavenia = System.nanoTime();
		uplynulyCas += casZastavenia - casSpustenia;
	}

	public long getUplynulyCas() {
		if (suSpustene) {
			long casZastavenia = System.nanoTime();
			return uplynulyCas + (casZastavenia - casSpustenia);
		} else {
			return uplynulyCas;
		}
	}

	public void vynuluj() {
		casSpustenia = uplynulyCas = 0;
		suSpustene = false;
	}

	public String convertNanosecondsToMiliseconds(long vstup) {
		double ms = (double) vstup / 1000000;
		return String.format("%.4f", ms);
	}

	public String convertNanosecondsToSeconds(long vstup) {
		double seconds = (double) vstup / 1000000000;
		return String.format("%.7f", seconds);
	}

}
