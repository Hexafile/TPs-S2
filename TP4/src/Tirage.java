import java.util.Random;

public class Tirage {
	public static void main(String[] args) {
		Random r = new Random();
		int[] list = new int[r.nextInt(6) + 5];
		int moyenne = 0;
		int tmp;

		System.out.print("Liste générée : ");
		for (int i = 0; i < list.length; i++) {
			list[i] = r.nextInt(11) + 10;
			System.out.print(list[i] + " ");
		}

		// moyenne
		for (int i = 0; i < list.length; i++) {
			moyenne += list[i];
		}
		System.out.println("\nMoyenne : " + (moyenne / ((double) list.length)));

		// minimum
		tmp = list[0];
		for (int i = 1; i < list.length; i++) {
			if (list[i] < tmp) {
				tmp = list[i];
			}
		}
		System.out.println("Minimum : " + tmp);

		// maximum
		tmp = list[0];
		for (int i = 1; i < list.length; i++) {
			if (list[i] > tmp) {
				tmp = list[i];
			}
		}
		System.out.println("Maximum : " + tmp);

	}
}
