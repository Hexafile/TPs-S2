public class Inscrit {
	String dossard;
	int score = 0;
	int temps = 0;

	Inscrit(int dossard, int score, int min, int sec) {
		if (dossard <= 100 && dossard >= 0 && score <= 50 && score >= 0
				&& min <= 60 && min >= 0 && sec >= 0 && sec <= 60) {
			this.dossard = "N°" + String.valueOf(dossard);
			this.score = score;
			this.temps = min * 60 + sec;
		}
	}

	public String toString() {
		return "[" + this.dossard + "," + this.score + " points," + this.temps
				+ "s]";
	}

	public static void main(String[] args) {
		Inscrit[] tab = new Inscrit[6];
		int index = 0;

		Inscrit i1 = new Inscrit(1, 45, 15, 20);
		if (i1.dossard != null) {
			tab[index] = i1;
			index++;
		}
		Inscrit i2 = new Inscrit(2, 32, 12, 45);
		if (i2.dossard != null) {
			tab[index] = i2;
			index++;
		}
		Inscrit i3 = new Inscrit(5, 12, 13, 59);
		if (i3.dossard != null) {
			tab[index] = i3;
			index++;
		}
		Inscrit i4 = new Inscrit(12, 12, 15, 70);
		if (i4.dossard != null) {
			tab[index] = i4;
			index++;
		}
		Inscrit i5 = new Inscrit(32, 75, 15, 20);
		if (i5.dossard != null) {
			tab[index] = i5;
			index++;
		}
		Inscrit i6 = new Inscrit(112, 75, 15, 20);
		if (i6.dossard != null) {
			tab[index] = i6;
			index++;
		}

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] != null) {
				System.out.println(tab[i].toString());
			}
		}

	}

}
