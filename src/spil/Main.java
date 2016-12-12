package spil;


import java.util.Scanner;

/**
 *
 * @author Gruppe:.19.
 */
public class Main {

	/**
	 * @param args
	 *            the command line arguments
	 */
	// Main klasse
	public static void main(String[] args) {
		// Definere spillerne
		int player1 = 0;
		int player2 = 0;

		System.out.println("Velkommen til Terning Splillet"); // Velkomst besked
																// via syso.

		// Kalder scanneren ind
		Scanner input = new Scanner(System.in);
		// Kalder Roll klassen
		Roll r = new Roll();

		while (true) {
			// Roll klassen kalde, herunder metoderne terning1 og terning 2
			int x, y;
			do {
				x = r.terning1();
				y = r.terning2();

				System.out.println("Player 1, Tryk 1 for at kaste");
				// If statement som be- eller afkræfter om det indtastede tal er
				// 1,
				// hvis ja så gælder det nedestående
				if (input.nextInt() == 1) {

					// Her printes x og y værdier, som er hentet fra et pre-def
					// klasse
					System.out.println("Du slog " + x + " og " + y);

					player1 = player1 + y + x;

					if (x == 1 && y == 1) {
						player1 = 0;
						System.out.println("Du slog to 1'ere. Du mister dine point!");
					}

					// Når man rammer 40 point skal man slå to af de samme tal
					// for vinde
					if (player1 >= 40) {

						if (x == y) {
							System.out.println("Du vandt");
							break;
						}
					}
					// Sær tilfælde - if statement
					if (x == 6 && y == 6) {
						System.out.println("Du slog 2 6'ere, hvis du slår 6'ere igen så vinder du");
						if (r.terning1() == 6 && r.terning2() == 6) {
							System.out.println("Du vandt!");
						}

					}

					System.out.println("Player 1 total er " + player1);

				}

			} while (x == y && x > 1);

			// Når man rammer 40 point skal man slå to af de samme tal
			if (player1 >= 40) {

				if (x == y) {
					//System.out.println("");
					break;
				}
			}

			int x1, y1;
			do {
				x1 = r.terning1();
				y1 = r.terning2();

				System.out.println("Player 2, Tryk 2 for at kaste");
				// If statement som be- eller afkræfter om det indtastede tal er
				// 1,
				// hvis ja så gælder det nedestående
				if (input.nextInt() == 2) {

					// Her printes x og y værdier, som er hentet fra et pre-def
					// klasse
					System.out.println("Du slog " + x1 + " og " + y1);

					player2 = player2 + y1 + x1;

					if (x1 == 1 && y1 == 1) {
						player2 = 0;
						System.out.println("Du slog to 1'ere. Du mister dine point!");
					}

					// Når man rammer 40 point skal man slå to af de samme tal
					// for vinde
					if (player2 >= 40) {

						if (x1 == y1) {
							System.out.println("Du vandt");
							break;
						}
					}
					// Sær tilfælde - if statement
					if (x1 == 6 && y1 == 6) {
						System.out.println("Du slog 2 6'ere, hvis du slår 6'ere igen så vinder du");
						if (r.terning1() == 6 && r.terning2() == 6) {
							System.out.println("Du vandt!");
						}

					}

					System.out.println("Player 2 total er " + player2);

				}

			} while (x1 == y1 && x1 > 1);

			// Når man rammer 40 point skal man slå to af de samme tal
			if (player2 >= 40) {
			}
			
		}
	}
}
