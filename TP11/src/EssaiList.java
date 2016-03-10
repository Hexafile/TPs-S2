import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EssaiList{
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Hello world");
		list.add("lololololol");
		list.add("cc");

		for (Iterator<String> iterateur = list.iterator(); iterateur.hasNext();) {
			System.out.println(iterateur.next());
		}

	}
}
