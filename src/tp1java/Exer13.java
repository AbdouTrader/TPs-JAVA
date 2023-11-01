package tp1java;

import java.util.Scanner;

public class Exer13

{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("entre la chaine de caractere :");
		String chaine = scn.nextLine();
		char caractere = 'a';
		// int len=chaine.length();
		int cnt = 0;
		int i = 0;
		char ch;
		do {

			ch = chaine.charAt(i);
			if (caractere == ch)
				cnt++;
			i++;
		} while (ch != '.');

		System.out.println("le nombre est :" + cnt);
		scn.close();

	}
}
