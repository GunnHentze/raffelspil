
public class Game {
	
	int spiller1 = 1;
	int spiller2 = 2;
	int validate = 0;
	int P1 = 0;
	int P2 = 0;
	
	
	public int roll() {
		return (int) (Math.random() *6 + 1);
	}

  P1= roll() + roll();
}
