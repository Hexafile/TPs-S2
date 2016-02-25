import java.util.ArrayList;

public class Alphabet {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < 26; i++) {
			list.add(i, "" + (char) (i + 97));
		}
		System.out.println(list.size());
		System.out.println(list.get(5));

		for (int i = 0; i < 26; i++) {
			if (list.get(i).equals("s")) {
				System.out.println(i);
				break;
			}
		}
		// ou
		System.out.println(list.lastIndexOf("s"));

		for (int i = 4; i < 7; i++) {
			list.remove(i);
		}
		System.out.println(list.size());
		
		
		System.out.println(list.toString());
		//ou
		for (String mot : list) {
			System.out.print(mot+", ");
		}
		
		//list.add(100,"?"); impossible
		
		list.removeAll(list);
		System.out.println("\n"+list.size());
	}
}
