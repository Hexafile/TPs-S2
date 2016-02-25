public class EssaiGrille {
	public static void main(String[] args) {
		Grille test = new Grille(3,5);
		if(test.remplir(0, 100,false,0.5)){;
			test.afficher();
			test.fenetre(200, 400);
		}
	}

}
