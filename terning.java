
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

		System.out.println("Velkomme til raflle splillet");

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("Player 1 Tryk 1 for at kaste");

			if (input.nextInt() == 1) {

				Random rand = new Random();
				int terning1 = rand.nextInt(6) + 1;
				int terning2 = rand.nextInt(6) + 1;
				System.out.println("Du slog " + terning1 + " og " + terning2);

				player1 = player1 + terning2 + terning1;

				if (terning1 == 1 && terning2 == 1) {
					player1 = 0;
					System.out.println("Du slog to 1'ere. Du mister dine point!");
				}

				if (terning1 == terning2 && terning1 > 1) {

					// Når man rammer 40 point skal man slå to af de samme tal
					if (player1 >= 40) {

						if (terning1 == terning2) {
							System.out.println("Du vandt");
						}
					}

					if (terning1 == 6 && terning2 == 6) {
						System.out.println("Du slog 2 6'ere, hvis du slår 6'ere igen");

					}

					System.out.println("Du får en ekstra tur!");
					terning1 = rand.nextInt(6) + 1;
					terning2 = rand.nextInt(6) + 1;
					System.out.println("Du slog i din ekstra tur " + terning1 + " og " + terning2);
					player1 = player1 + terning2 + terning1;

					if (terning1 == terning2) {

						System.out.println("Du får en ekstra tur!");
						terning1 = rand.nextInt(6) + 1;
						terning2 = rand.nextInt(6) + 1;
						System.out.println("Du slog i din ekstra tur " + terning1 + " og " + terning2);
						player1 = player1 + terning2 + terning1;

						if (terning1 == terning2) {
							System.out.println("Du får en ekstra tur!");
							terning1 = rand.nextInt(6) + 1;
							terning2 = rand.nextInt(6) + 1;
							System.out.println("Du slog i din ekstra tur " + terning1 + " og " + terning2);
							player1 = player1 + terning2 + terning1;

						}

					}

				}

				System.out.println("Player 1 total er " + player1);

				// Når man rammer 40 point skal man slå to af de samme tal
				if (player1 >= 40) {

					if (terning1 == terning2) {
						System.out.println("Du vandt");
						break;
					}
				}
			}

			int x = player1;

			System.out.println("Player 2 tryk 2 for at kaste");
			if (input.nextInt() == 2) {

				Random rand = new Random();

				int terning1 = rand.nextInt(6) + 1;
				int terning2 = rand.nextInt(6) + 1;

				System.out.println("Du slog " + terning1 + " og " + terning2);

				player2 = player2 + terning1 + terning2;

				// To 1'ere mister alle point.
				if (terning1 == 1 && terning2 == 1) {
					player2 = 0;
					System.out.println("Du slog to 1'ere. Du mister dine point!");
				}

				if (terning1 == terning2 && terning1 > 1) {

					// Når man rammer 40 point skal man slå to af de samme tal
					if (player2 >= 40) {

						if (terning1 == terning2) {
							System.out.println("Du vandt");
							break;
						}
					}
					if (terning1 == 6 && terning2 == 6) {
						System.out.println("Du slog 2 6'ere, hvis du slår 6'ere igen");

					}

					System.out.println("Du får en ekstra tur!");
					terning1 = rand.nextInt(6) + 1;
					terning2 = rand.nextInt(6) + 1;
					System.out.println("Du slog i din ekstra tur " + terning1 + " og " + terning2);
					player2 = player2 + terning2 + terning1;

					if (terning1 == terning2) {

						System.out.println("Du får en ekstra tur!");
						terning1 = rand.nextInt(6) + 1;
						terning2 = rand.nextInt(6) + 1;
						System.out.println("Du slog i din ekstra tur " + terning1 + " og " + terning2);
						player2 = player2 + terning2 + terning1;

						if (terning1 == terning2) {
							System.out.println("Du får en ekstra tur!");
							terning1 = rand.nextInt(6) + 1;
							terning2 = rand.nextInt(6) + 1;
							System.out.println("Du slog i din ekstra tur " + terning1 + " og " + terning2);
							player2 = player2 + terning2 + terning1;

						}

					}

				}

				System.out.println("Player 2 total er " + player2);

				// Når man rammer 40 point skal man slå to af de samme tal
				if (player2 >= 40) {

					if (terning1 == terning2) {
						System.out.println("Du vandt");
						break;
					}
				}

			}

		}

	}
}
