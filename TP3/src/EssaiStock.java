public class EssaiStock {
	public static void main(String[] args) {
		Stock stock = new Stock(2);
		stock.ajoutArticle(new ArticlesEnStock("PC", "xdf10"));
		stock.getArticleByPosition(0).ajouter(20);
		stock.ajoutArticle(new ArticlesEnStock("Ecran", "koz106"));
		stock.getArticleByPosition(1).ajouter(30);
		stock.getArticleByPosition(1).retirer(10);

		System.out.println(stock.toString());
		System.out.println("Ecrans en stock : "+stock.getArticleByPosition(1).getQuantite());

		int art = 0;
		for (int i = 0; i < stock.nbReferences(); i++) {
			art = art + stock.getArticleByPosition(i).getQuantite();
		}
		System.out.println("Articles en stock : "+art);
	}
}
