package spil;


//Klasse der repræsentere raflebægeret
public class Roll {
	
	
	public int terning1(){
		
		int terning1 = (int) (Math.random()*6 + 1);
		
		return terning1;
	}
	
	public int terning2(){
		
		int terning2 = (int) (Math.random()*6 + 1);
		
		return terning2;
	}
}
