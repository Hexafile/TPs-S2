import java.util.ArrayList;


public class Agenda extends Evenement{
	ArrayList<Evenement> list = new ArrayList<>();
	
	Agenda(){}
	
	boolean entrable(Evenement e){
		for(Evenement ev : this.list){
			if(e.chevauchement(ev)) return false;
		}
		return true;
	}
	
	void entrerEvenement(Evenement e){
		if(entrable(e)) list.add(e);
	}
	
	void supprimerEvenement(Evenement e){
		list.remove(list.lastIndexOf(e));
	}
	
	void supprimerEvenement(int i){
		list.remove(i);
	}
	
	void supprimerChevauchants(Evenement e){
		for(Evenement ev : this.list){
			if(e.chevauchement(ev)) supprimerEvenement(ev);
		}
		entrerEvenement(e);
	}
}
