package spil;

public class Roll {
	
	
	public int terning1(){
		
		int terning1 = (int) (Math.random()*6 + 1);
		
		
		return terning1;
	}
	
	public int terning2(){
		
		int terning2 = (int) (Math.random()*6 + 1);
		
		return terning2;
	}
	
	
	public int ekstraRoll(int player){

		
		System.out.println("Du får en ekstra tur!");
		System.out.println("Du slog i din ekstra tur " + this.terning1() + " og " + this.terning2());
		
		player = player + this.terning1() + this.terning2();
		return player;
	}
}
