
public class Game {
	
	int spiller1 = 1;
	int spiller2 = 2;
	int validate = 0;
	int P1 = 0;
	int P2 = 0;
	
	
	public int roll() {
		return (int) (Math.random() *6 + 1);
	}

public int PointSum() {
	
	if(validate == spiller1){
		P1 = P1 + roll() + roll();
		return P1;
	}
	return 0;
}
public int PointSum1(){
	
	if(validate == spiller2){
		P2 = P2 + roll() + roll();
		return P2;
	}
	return 0;
}
}
