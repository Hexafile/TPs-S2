
public class JoueurBis {

	String nom ;
	int cumul = 20;
	int nbLancers ;
	java.util.Random r=new java.util.Random();
	
	JoueurBis(String n){
		nom=n;
	}
	
	void jouer() {
		cumul -= r.nextInt(6)+1;
		nbLancers++;
	}
	

	int bat(Joueur j){
		return nbLancers-j.nbLancers;
	}
	
	@Override
	public String toString() {
		return "Joueur [nom=" + nom + ", nbLancers=" + nbLancers + ", "
				+ "cumul=" + cumul + "]";
	}
}
