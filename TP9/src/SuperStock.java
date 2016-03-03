
public class SuperStock {
	Stock s;
	
	public SuperStock(int maxArticles) {
		s= new Stock(maxArticles);
	}
	
	public String toString(){
		return s.toString();
	}
	
	public void ajoutArticle(ArticlesEnStock a){
		s.ajoutArticle(a);
	}
	
	public ArticlesEnStock getArticleByPosition(int num){
		return s.getArticleByPosition(num);
	}
	
	public int nbReferences(){
		return s.nbReferences();
	}
	
	public ArticlesEnStock getByNom(String nom){
		for(int i = 0 ; i<nbReferences(); i++){
			if(getArticleByPosition(i).getNom().equals(nom)){
				return getArticleByPosition(i);
			}
		}
		return null;
	}
	
	public ArticlesEnStock getByCode(String code){
		for(int i = 0 ; i<nbReferences(); i++){
			if(getArticleByPosition(i).getCode().equals(code)){
				return getArticleByPosition(i);
			}
		}
		return null;
	}
}
