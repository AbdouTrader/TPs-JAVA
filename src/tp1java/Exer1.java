package tp1java;
import java.util.Scanner;

public class Exer1
{

	
	
	
	public static void main(String[] args)
	{
		System.out.println("Saisir 1 ere nombre : ");
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		
		System.out.println("Saisir 2 eme nombre : ");
		
		int n2=scn.nextInt();
		int somme=n1+n2;
		System.out.println("la somme de " + n1+ " + " + n2+ " est :" + somme);
		scn.close();
	}
}

