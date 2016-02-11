import java.util.Random;

public class carte {
	public static void main(String[] args) {
		Random r = new Random();

		/*
		 * for(int i = 0; i<32; i++){ System.out.println(new
		 * Carte(r.nextInt(5),r.nextInt(8))); }
		 */

		Carte c1 = new Carte(r.nextInt(5), r.nextInt(8));
		Carte c2 = new Carte(r.nextInt(5), r.nextInt(8));
		System.out
				.println("La carte c1 précède la carte c2: " + c1.precede(c2));

		Carte max = new Carte(r.nextInt(5), r.nextInt(8));
		for (int i = 0; i < 10; i++) {
			Carte cartenew = new Carte(r.nextInt(5), r.nextInt(8));
			if (max.compareTo(cartenew) < 0) {
				max = cartenew;
			}
		}
		System.out.println(max.toString());
	}
}
