import java.util.Calendar;
import java.util.GregorianCalendar;

public class Evenement {
	String intitule = "", lieu = "";
	GregorianCalendar debut, fin;

	Evenement() {
		this.debut = new GregorianCalendar();
		this.fin = new GregorianCalendar();
	}

	Evenement(String i, String l, GregorianCalendar d, GregorianCalendar f) {
		this.intitule = i;
		this.lieu = l;
		this.debut = d;
		if (d.before(f)) {
			this.fin = f;
		} else {
			this.fin = d;
		}
	}
	
	public String toString(){
		return this.intitule+";"+this.lieu+";"+this.debut.get(Calendar.DAY_OF_MONTH) + "-"
				+ (this.debut.get(Calendar.MONTH) + 1) + "-"
				+ this.debut.get(Calendar.YEAR)+";"+this.fin.get(Calendar.DAY_OF_MONTH) + "-"
				+ (this.fin.get(Calendar.MONTH) + 1) + "-"
				+ this.fin.get(Calendar.YEAR);
	}
	
	boolean equals(Evenement e){
		return this.intitule.equals(e.intitule) && this.lieu.equals(e.lieu) && this.debut.equals(e.debut) && this.fin.equals(e.fin);
	}
	
	boolean chevauchement(Evenement e){
		return this.fin.after(e.debut) || this.debut.before(e.fin);
	}
	
	public static void main(String[] args) {
		Evenement e1 = new Evenement("Cucurbitane","Marchiennes",new GregorianCalendar(2016,11,05),new GregorianCalendar(2016,11,04));
		System.out.println(e1.toString());
		Evenement e2 = new Evenement("Cucurbitane","Marchiennes",new GregorianCalendar(2016,11,05),new GregorianCalendar(2016,11,04));
		System.out.println(e1.equals(e2));
		
	}
}
