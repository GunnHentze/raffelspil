import java.util.Random;

/**
 * Created by Khurrrmiiii on 30/09/2016.
 */
public class Terning {
    spiller sp = new spiller();
    //Definere 2 spillere
    int player1 = 1;
    int player2 = 2;
    int validate = 0;

    //Class-diagram: Terning
        Random rand = new Random();
        int t1 = rand.nextInt(5) + 1;
        int t2 = rand.nextInt(5) + 1;
        int sum = t1 + t2;
    }

