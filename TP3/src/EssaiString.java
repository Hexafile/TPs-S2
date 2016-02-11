public class EssaiString {
	public static void main(String[] args) {
		String res = "";
		String point = "";
		String matches = "";
		for(int i = 0; i<args.length ; i++){
			res += args[i]+";";
			if(args[i].contains(".")){
				point += args[i];
			}
			if(args[i].matches(".*\\d.*")){
				matches += args[i];
			}
		}
		System.out.println(res);
		System.out.println("Longueur : "+res.length());
		System.out.println("Paramètres avec un . : "+point);
		System.out.println("Paramètres avec un matches : "+matches);
	}
}
