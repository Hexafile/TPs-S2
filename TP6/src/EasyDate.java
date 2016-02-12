import java.util.Calendar;
import java.util.GregorianCalendar;

public class EasyDate {
	GregorianCalendar g;

	EasyDate(){
		this.g = new GregorianCalendar();
	}
	EasyDate(int jour, int mois) {
		this.g = new GregorianCalendar();
		this.g.set(Calendar.MONTH, mois-1);
		this.g.set(Calendar.DAY_OF_MONTH, jour);
	}
	EasyDate(int jour, int mois, int annee){
		this.g = new GregorianCalendar(annee,mois-1,jour);
	}
	EasyDate(String s){
		if(s.matches("\\d\\d/\\d\\d/\\d\\d\\d\\d")){
			this.g= new GregorianCalendar(Integer.parseInt(s.substring(6,10)),(Integer.parseInt(s.substring(3,5)))-1,Integer.parseInt(s.substring(0,2)));
		}
	}
	
	public String toString(){
		if(g==null){
			return "Format incorrect";
		}else{
			return this.g.get(Calendar.DAY_OF_MONTH)+"-"+(this.g.get(Calendar.MONTH)+1)+"-"+this.g.get(Calendar.YEAR);
		}
	}
	
	public static void main(String[] args) {
		EasyDate actuelle = new EasyDate();
		System.out.println(actuelle.toString());
		
		EasyDate d = new EasyDate("01/02/2015");
		System.out.println(d.toString());
		
		EasyDate d1 = new EasyDate(12,2);
		System.out.println(d1.toString());
		
		EasyDate d2 = new EasyDate(12,2,2015);
		System.out.println(d2.toString());
	}
}
