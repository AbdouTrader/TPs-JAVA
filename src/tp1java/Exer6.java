package tp1java;

import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		System.out.println("Saisir le nombre 1 : ");
		Scanner scn = new Scanner(System.in);
		double n1 = scn.nextDouble();

		System.out.println("Saisir le nombre  2 : ");

		double n2 = scn.nextDouble();
		System.out.println(" les valeurs des deux nombres avant est : n1: " + n1 + " et n2 : " + n2);
		double n3;
		n3 = n1;
		n1 = n2;
		n2 = n3;
		System.out.println(" les valeurs des deux nombres apres est : n1: " + n1 + " et n2 : " + n2);
		scn.close();

	}

}
