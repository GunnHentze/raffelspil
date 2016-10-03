import java.util.Scanner;

/**
 * Created by Khurrrmiiii on 30/09/2016.
 */
public class spiller {
    //Her defineres pointene

    //String som indeholder spiller 1 og spiller 2
    public String toString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player 1: ");
        String player1 = sc.nextLine();
        System.out.println("Enter player 2: ");
        String player2 = sc.nextLine();
        return player1+" and "+player2;
    }
//Taugyn
}
