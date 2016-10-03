import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		spiller sp = new spiller();
		Terning t = new Terning();
		Point p = new Point();

		System.out.println("Welcome: " + sp.toString());

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Player press 1 to roll");

			int a = sc.nextInt();

			if (a == 1) {
				p.validate = 1;
				System.out.println("Slag: " + t.t1 + ", " + t.t2);
			} else {
				System.out.println("Error");
			}

			System.out.println("Player 2 press 2 to roll");
			int b = sc.nextInt();

			if (b == 2) {
				p.validate = 2;
				System.out.println("Slag: " + t.t3 + ", " + t.t4);
			} else {
				System.out.println("Error");
			}

		}
	}
}