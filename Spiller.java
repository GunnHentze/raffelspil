import java.util.Scanner;

public class Spiller {

    public String toString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indstast Spiller 1: ");
        String spiller1 = sc.nextLine();
        System.out.println("Indstast Spiller 2: ");
        String spiller2 = sc.nextLine();
        return spiller1+" and "+spiller2;
    }
}
