
public class essaiEasyDate {
	public static void main(String[] args) {
		EasyDate actuelle = new EasyDate();
		System.out.println(actuelle.toString());

		EasyDate d = new EasyDate("01/02/2015");
		System.out.println(d.toString());

		EasyDate d1 = new EasyDate(12, 2);
		System.out.println(d1.toString());

		EasyDate d2 = new EasyDate(12, 2, 2015);
		System.out.println(d2.toString());
		
		
		
		
	}
}
