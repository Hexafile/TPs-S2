public class JeuToutSeulBis {
	public static void main(String[] args) {

		int total = 0; // total à atteindre

		// Un seul joueur
		JoueurBis cesar = new JoueurBis("Cesar");

		// Partie seul
		while (cesar.cumul >= total) {
			cesar.jouer();
		}

		System.out.println(cesar.nbLancers);

	}

}