
public class EssaiStringBuffer {
public static void main(String[] args) {
	StringBuffer str = new StringBuffer("Paramètres : ");
	
	for(int i = 0; i<args.length ; i++){
		str.append(args[i]);
	}
}
}
