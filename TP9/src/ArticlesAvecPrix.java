
public class ArticlesAvecPrix {
	ArticlesEnStock articles;
	int prixUnitaire = 0;
	int prixTotal = 0;
	
	public ArticlesAvecPrix(String nom, String code) {
		articles = new ArticlesEnStock(nom,code);
	}
	
	public String toString(){
		return articles.toString();
	}
	
	public String getNom(){
		return articles.getNom();
	}
	
	public String getCode(){
		return articles.getCode();
	}
	
	public void setPrixUnitaire(int p){
		prixUnitaire = p;
	}
	
	public void ajout(int q){
		articles.ajouter(q);
		prixTotal += prixUnitaire*q;
	}
	
	public int getQuantite(){
		return articles.getQuantite();
	}
	
	public void retrait(int q){
		articles.retirer(q);
		prixTotal -= prixMoyen()*q;
	}

	private int prixMoyen() {
		return prixTotal/getQuantite();
	}
}
