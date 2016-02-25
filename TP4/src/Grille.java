public class Grille {
	int x, y;
	int tab[][];

	public Grille(int x, int y) {
		this.x = x;
		this.y = y;
		this.tab = new int[x][y];
		for (int i = 0; i < this.x; i++) {
			for (int j = 0; j < this.y; j++) {
				this.tab[i][j] = 0;
			}
		}
	}

	boolean remplir(int min, int max, boolean doublon, double taux) {
		java.util.Random r = new java.util.Random();
		int tmp = 0;
		if (max < min && taux >1 && taux <0) {
			return false;
		} else {
			if (doublon) {
				for (int i = 0; i < this.x; i++) {
					for (int j = 0; j < this.y; j++) {
						this.tab[i][j] = r.nextInt(max - min + 1) + min;
					}
				}
			} else {
				for (int i = 0; i < this.x; i++) {
					for (int j = 0; j < this.y; j++) {
						do {
							tmp = r.nextInt(max - min + 1) + min;
						} while (recherche(tmp));
						if (r.nextDouble() > taux) {
							this.tab[i][j] = tmp;
						}else{
							this.tab[i][j] = 0;
						}
					}
				}
			}
			return true;
		}
	}

	void afficher() {
		for (int i = 0; i < this.x; i++) {
			System.out.print("|");
			for (int j = 0; j < this.y; j++) {
				if (this.tab[i][j] > 9) {
					System.out.print(this.tab[i][j] + "|");
				} else {
					System.out.print(this.tab[i][j] + " |");
				}
			}
			System.out.print("\n");
		}
	}

	void fenetre(int left, int top) {
		Tableau fenetre = new Tableau(left, top, this.tab);
	}

	boolean recherche(int test) {
		boolean ok = false;
		int i = 0, j = 0;
		while (!ok && i < this.x) {
			while (!ok && j < this.y) {
				if (this.tab[i][j] == test) {
					ok = true;
				}
				j++;
			}
			i++;
		}
		return ok;
	}
}
