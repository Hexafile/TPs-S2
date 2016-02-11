
/**
 * Classe Joueur modélise un joueur de dés 
 * avec son nom, son cumul de points et son nombre de lancers
 * @author M2103
 *
 */
public class Joueur {

	/**
	 * Nom du joueur
	 */
	String nom ;
	/**
	 * Cumul du joueur
	 */
	int cumul ;
	/**
	 * Nombre de lancers du joueur
	 */
	int nbLancers ;
	/**  
	Génerateur valeurs aléatoires
	*/
	java.util.Random r=new java.util.Random();
	

	/**
	 * Crée un Joueur avec un nom n
	 *  cumul et nombre de lancers à 0
	 *  @param n le nom du joueur
	 */
	Joueur(String n){
		nom=n;
	}
	
	/**
	 * Méthode ajoutant au cumul le résultat d'un lancer de dé
	 */
	void jouer() {
		cumul += r.nextInt(6)+1;
		nbLancers++;
	}
	
	/**
	 * Compare le nombre de lancers de deux joueurs
	 * @param j le joueur à comparer
	 * @return positif si le score du joueur est plus grand que celui de j
	 * 		   négatif si le score du joueur est plus petit que celui de j
	 * 		   nul en cas d'égalité
	 */
	int bat(Joueur j){
		return nbLancers-j.nbLancers;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Joueur [nom=" + nom + ", nbLancers=" + nbLancers + ", "
				+ "cumul=" + cumul + "]";
	}

}

