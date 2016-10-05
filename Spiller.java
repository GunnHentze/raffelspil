import java.util.Scanner;

public class Spiller {

    public String toString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indstast Spiller 1: ");
        String player1 = sc.nextLine();
        System.out.println("Indstast Spiller 2: ");
        String player2 = sc.nextLine();
        return player1+" and "+player2;
    }
}
}
