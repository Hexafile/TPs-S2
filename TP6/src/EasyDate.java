import java.util.Calendar;
import java.util.GregorianCalendar;

public class EasyDate {
	GregorianCalendar g;

	EasyDate() {
		this.g = new GregorianCalendar();
	}

	EasyDate(int jour, int mois) {
		this.g = new GregorianCalendar();
		this.g.set(Calendar.MONTH, mois - 1);
		this.g.set(Calendar.DAY_OF_MONTH, jour);
	}

	EasyDate(int jour, int mois, int annee) {
		this.g = new GregorianCalendar(annee, mois - 1, jour);
	}

	EasyDate(String s) {
		if (s.matches("\\d\\d/\\d\\d/\\d\\d\\d\\d")) {
			this.g = new GregorianCalendar(
					Integer.parseInt(s.substring(6, 10)), (Integer.parseInt(s
							.substring(3, 5))) - 1, Integer.parseInt(s
							.substring(0, 2)));
		}
	}

	boolean equals(EasyDate e) {
		if (e.g.get(Calendar.DAY_OF_MONTH) == this.g.get(Calendar.DAY_OF_MONTH)
				&& e.g.get(Calendar.MONTH) == this.g.get(Calendar.MONTH)
				&& e.g.get(Calendar.YEAR) == this.g.get(Calendar.YEAR)) {
			return true;
		}
		return false;
	}

	int compareTo(EasyDate e) {
		int easyDate = e.g.get(Calendar.DAY_OF_MONTH) + e.g.get(Calendar.MONTH)
				* 30 + e.g.get(Calendar.YEAR) * 365;
		int easyG = g.get(Calendar.DAY_OF_MONTH) + g.get(Calendar.MONTH) * 30
				+ g.get(Calendar.YEAR) * 365;

		return easyDate - easyG;
	}

	public String toString() {
		if (g == null) {
			return "Format incorrect";
		} else {
			return this.g.get(Calendar.DAY_OF_MONTH) + "-"
					+ (this.g.get(Calendar.MONTH) + 1) + "-"
					+ this.g.get(Calendar.YEAR);
		}
	}
}
