package tp1java;

import java.util.Scanner;

public class Exer14 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("entre la note 1 :");
		double note1 = scn.nextDouble();

		System.out.println("entre la note 2 :");
		double note2 = scn.nextDouble();
		System.out.println("entre la note 3 :");
		double note3 = scn.nextDouble();
		System.out.println("entre la note 4 :");
		double note4 = scn.nextDouble();
		if (note1 >= 0 && note1 <= 20 && note2 >= 0 && note2 <= 20 && note3 >= 0 && note3 <= 20 && note4 >= 0
				&& note4 <= 20) {
			double moyenne = (note1 + note2 + note3 + note4) / 4;
			System.out.println("votre moyenne est : " + moyenne + " ");
			if (moyenne < 12 && moyenne >= 10)
				System.out.println("Passable ");
			if (moyenne < 14 && moyenne >= 12)
				System.out.println("Assez bien ");
			if (moyenne < 16 && moyenne >= 14)
				System.out.println("Bien ");
			if (moyenne >= 16)
				System.out.println("Tres bien ");
		} else
			System.out.println("note innaceptable !");
		scn.close();
	}
}
