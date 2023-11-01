package tp1java;

import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
		System.out.println("combien de quantite tu as acheter: ");
		Scanner scn = new Scanner(System.in);
		int qte = scn.nextInt();

		System.out.println("quel est le prix de chacun : ");

		int prix = scn.nextInt();
		int montant = qte * prix;
		System.out.println("le montant  de produit est : " + montant);

		scn.close();
	}
}
