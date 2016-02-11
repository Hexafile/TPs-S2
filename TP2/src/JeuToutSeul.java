public class JeuToutSeul {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	int total = 20; // total à atteindre
		
		// Un seul joueur
		Joueur cesar= new Joueur("Cesar");
			
		// Partie seul
		while (cesar.cumul<total) {
			cesar.jouer();
		}
		
		System.out.println(cesar.nbLancers);		
			
	}

}

