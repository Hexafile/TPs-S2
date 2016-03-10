import java.util.Iterator;


public class PlateauIterator implements Iterator<Integer>{
	
	int[][] plateau;
	int x = 0;
	int y = 0;
	
	public PlateauIterator(int[][] plateau) {
		this.plateau = plateau;
	}
	
	public boolean hasNext(){
		return x*y < (plateau[0].length-1)*(plateau[1].length-1);
	}
	
	public Integer next(){
		if(hasNext()){
			if(y<plateau[1].length-1){
				y++;
			}else{
				x++;
			}
			return plateau[x][y];
		}
		return null;
	}
	
	@Override
	public void remove() {}
	
	public static void main(String[] args) {
		int[][] plateau = new int[10][10];
		for(int x=0;x<10;x++){
			for(int y=0;y<10;y++){
				plateau[x][y] =x*y;
			}
		}
		Iterator<Integer> ite = new PlateauIterator(plateau);
		for(int i = 0;i<100 ; i++){
			System.out.println(ite.next());
		}
		
	}
}
