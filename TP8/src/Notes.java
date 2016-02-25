import java.util.HashMap;
import java.util.Random;

import javax.swing.JOptionPane;

public class Notes {
	public static void main(String[] args) {
		HashMap<String, int[]> map = new HashMap<>();

		String[] noms = new String[] { "Pierre", "Paul", "Jacques", "Vincent",
				"Francois" };

		for (int i = 0; i < noms.length; i++) {
			Random r = new Random();
			map.put(noms[i], new int[] { r.nextInt(11) + 10,
					r.nextInt(11) + 10, r.nextInt(11) + 10, r.nextInt(11) + 10,
					r.nextInt(11) + 10 });
		}		
	}
}
