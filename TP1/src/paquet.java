import java.util.Random;

public class paquet {
	public static void main(String[] args) {
		Carte[] tab = new Carte[32];
		Random r = new Random();
		int cpt = -1;
		for (int i = 0; i < tab.length; i++) {
			if (i % 8 == 0) {
				cpt++;
			}
			tab[i] = new Carte(cpt, i - cpt * 8);
		}

		for (int i = 0; i < 500; i++) {
			int first = r.nextInt(32);
			int sec =r.nextInt(32);
			Carte tmp = tab[first];
			tab[first] = tab[sec];
			tab[sec]= tmp;
		}
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i].toString());
		}
	}
}
