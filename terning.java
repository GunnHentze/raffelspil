
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Injam DCF
 */
public class terning {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		int player1 = 0;
		int player2 = 0;

		System.out.println("Velkommen til Terning Splillet");

		Scanner input = new Scanner(System.in);
		
		Roll r = new Roll();

		while (true) {
			
			int x = r.terning1();
			
			int y = r.terning2();

			System.out.println("Player 1, Tryk 1 for at kaste");

			if (input.nextInt() == 1) {

				Random rand = new Random();

				System.out.println("Du slog " + x + " og " + y);

				player1 = player1 + y + x;
				
				if (input.nextInt() == 28){
					player1 = player1 + y + x + x + y;
				}

				if (x == 1 && y == 1) {
					player1 = 0;
					System.out.println("Du slog to 1'ere. Du mister dine point!");
				}

				if (x == y && x > 1) {

					// Når man rammer 40 point skal man slå to af de samme tal
					if (player1 >= 40) {

						if (x == y) {
							System.out.println("Du vandt");
							break;
						}
					}

					if (x == 6 && y == 6) {
						System.out.println("Du slog 2 6'ere, hvis du slår 6'ere igen");

					}

					System.out.println("Du får en ekstra tur!");
					x = rand.nextInt(6) + 1;
					y = rand.nextInt(6) + 1;
					System.out.println("Du slog i din ekstra tur " + x + " og " + y);
					player1 = player1 + y + x;

					if (x == y) {

						System.out.println("Du får en ekstra tur!");
						x = rand.nextInt(6) + 1;
						y = rand.nextInt(6) + 1;
						System.out.println("Du slog i din ekstra tur " + x + " og " + y);
						player1 = player1 + y + x;

						if (x == y) {
							System.out.println("Du får en ekstra tur!");
							x = rand.nextInt(6) + 1;
							y = rand.nextInt(6) + 1;
							System.out.println("Du slog i din ekstra tur " + x + " og " + y);
							player1 = player1 + y + x;

						}

					}

				}

				System.out.println("Player 1 total er " + player1);

				// Når man rammer 40 point skal man slå to af de samme tal
				if (player1 >= 40) {

					if (x == y) {
						System.out.println("Du vandt");
						break;
					}
				}
			}
			
            int x1 = r.terning1();
			
			int y1 = r.terning2();

			System.out.println("Player 2 tryk 2 for at kaste");
			if (input.nextInt() == 2) {

				Random rand = new Random();

				System.out.println("Du slog " + x1 + " og " + y);

				player2 = player2 + x1 + y;

				// To 1'ere mister alle point.
				if (x1 == 1 && y == 1) {
					player2 = 0;
					System.out.println("Du slog to 1'ere. Du mister dine point!");
				}

				if (x1 == y && x1 > 1) {

					// Når man rammer 40 point skal man slå to af de samme tal
					if (player2 >= 40) {

						if (x1 == y) {
							System.out.println("Du vandt");
							break;
						}
					}
					if (x1 == 6 && y == 6) {
						System.out.println("Du slog 2 6'ere, hvis du slår 6'ere igen");

					}

					System.out.println("Du får en ekstra tur!");
					x1 = rand.nextInt(6) + 1;
					y = rand.nextInt(6) + 1;
					System.out.println("Du slog i din ekstra tur " + x1 + " og " + y);
					player2 = player2 + y + x1;

					if (x1 == y) {

						System.out.println("Du får en ekstra tur!");
						x1 = rand.nextInt(6) + 1;
						y = rand.nextInt(6) + 1;
						System.out.println("Du slog i din ekstra tur " + x1 + " og " + y);
						player2 = player2 + y + x1;

						if (x1 == y) {
							System.out.println("Du får en ekstra tur!");
							x1 = rand.nextInt(6) + 1;
							y = rand.nextInt(6) + 1;
							System.out.println("Du slog i din ekstra tur " + x1 + " og " + y);
							player2 = player2 + y + x1;

						}

					}

				}

				System.out.println("Player 2 total er " + player2);

				// Når man rammer 40 point skal man slå to af de samme tal
				if (player2 >= 40) {

					if (x1 == y) {
						System.out.println("Du vandt");
						break;
					}
				}

			}

		}

	}
}
