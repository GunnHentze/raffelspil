import java.util.Random;

/**
 * Created by Khurrrmiiii on 30/09/2016.
 */
public class Terning {
	Random rand = new Random();
	

		public int roll() {
			return (int) (Math.random() *6 + 1);
		}
		
}
