public class JeuADeux {
	public static void main(String[] args) {

		int total = 20; // total à atteindre

		// Un seul joueur
		Joueur cesar = new Joueur("Cesar");
		Joueur julius = new Joueur("Julius");

		// Partie seul
		while (cesar.cumul < total) {
			cesar.jouer();
		}
		
		while (julius.cumul < total) {
			julius.jouer();
		}
		
		System.out.println("Cesar a "+cesar.nbLancers+" de cumul\nJulius a "+julius.nbLancers+" de cumul");
		if(cesar.bat(julius)<0){
			System.out.println("Cesar gagne!");
		}else if(julius.bat(cesar)<0){
			System.out.println("Julius gagne!");
		}else{
			System.out.println("Egalité !");
		}


	}
}
