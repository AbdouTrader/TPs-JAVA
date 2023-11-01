package tp1java;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		System.out.println("Saisir 1 ere nombre : ");
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();

		System.out.println("Saisir 2 eme nombre : ");

		int n2 = scn.nextInt();
		System.out.println("Saisir 3 eme nombre : ");

		int n3 = scn.nextInt();
		int somme = n1 + n2 + n3;
		int multi = n1 * n2 * n3;
		double moyenne = somme / 3;

		System.out.println("la somme de " + n1 + " + " + n2 + "+" + n3 + " est :" + somme);
		System.out.println("le multiplication de " + n1 + " * " + n2 + " * " + n3 + " est :" + multi);
		System.out.println("le moyenne est : " + moyenne);

		scn.close();

	}
}
