package sk.bernardkaminski.merge_sort;

public class Stopky {

	private boolean suSpustene;
	private long uplynulyCas;
	private long casSpustenia;

	public Stopky() {
		vynuluj();
	}

	public void start() {
		if (suSpustene) {
			return;
		}
		suSpustene = true;
		casSpustenia = System.currentTimeMillis();
	}

	public void stop() {
		if (!suSpustene) {
			return;
		}
		long casZastavenia = System.currentTimeMillis();
		uplynulyCas += casZastavenia - casSpustenia;
	}

	public long getUplynulyCas() {
		if (suSpustene) {
			long casZastavenia = System.currentTimeMillis();
			return uplynulyCas + (casZastavenia - casSpustenia);
		} else {
			return uplynulyCas;
		}
	}

	public void vynuluj() {
		casSpustenia = uplynulyCas = 0;
		suSpustene = false;
	}
}
