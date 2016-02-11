import java.util.Random;

public class numerote {

	
	public static void main(String[] args) {
		for (int i = 0; i < 45; i=i+11) {
			System.out.println(new Telephone(i,i,i,i,i));
		}
		Random r = new Random();
		for(int i =0 ; i<5;i++){
			System.out.println(new Telephone(r.nextInt(10),r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(100)).toString());
		}
		
	}
}
