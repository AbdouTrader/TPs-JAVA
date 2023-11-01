package tp1java;

import java.util.Scanner;

public class Exer4 {
	public static void main(String[] args) {
		System.out.println("Saisir un nombre : ");
		Scanner scn = new Scanner(System.in);
		double n1 = scn.nextDouble();

		if (n1 > 0) {
			System.out.println("le nombre est positif");
		} else if (n1 < 0)
			System.out.println("le nombre est negatif");
		else

			System.out.println("le nombre est null");
		scn.close();

	}
}
