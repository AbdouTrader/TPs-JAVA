package tp1java;

import java.util.Scanner;

public class Exer12 {
	public static void main(String[] args) {
		System.out.println(" entrez val de n : ");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int multi = 1;
		for (int i = 0; i < n; i++) {
			multi *= i + 1;

		}
		System.out.println("la multiplication est  est : " + multi);
		scn.close();
	}

}
