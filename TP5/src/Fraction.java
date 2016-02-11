public class Fraction {
	int numerateur;
	int denominateur;

	Fraction(int n, int d) {
		this.numerateur = n;
		this.denominateur = d;
	}
	
	public String toString(){
		return this.numerateur+"/"+this.denominateur;
	}
	
	Fraction somme(Fraction f){
		return new Fraction(this.numerateur*f.denominateur+f.numerateur*this.denominateur,this.denominateur*f.denominateur);
	}

	void additionner(Fraction f) {
		this.denominateur = this.denominateur*f.denominateur;
		this.numerateur =this.numerateur*f.denominateur+f.numerateur*this.denominateur;
	}
	
	Fraction produit(Fraction f){
		return new Fraction(this.numerateur*f.numerateur,this.denominateur*f.denominateur);
	}
	
	Fraction produit(int ent){
		return new Fraction(this.numerateur*ent, this.denominateur*ent);
	}
	
	void multiplier(Fraction f){
		this.denominateur = this.denominateur*f.denominateur;
		this.numerateur =this.numerateur*f.numerateur;
	}
	
	void multiplier(int ent){
		this.denominateur = this.denominateur*ent;
		this.numerateur =this.numerateur*ent;
	}
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(2,3);
		System.out.println(f1.toString());
		f1.multiplier(2);
		System.out.println(f1.toString());
		
		Fraction f2 = new Fraction(2,3);
		Fraction f3 = f1.somme(f2);
		System.out.println(f3.toString());
		
		f3 = f1.produit(f2);
	}
}
