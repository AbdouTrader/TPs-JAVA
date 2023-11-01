package tp1java;
import java.util.Scanner;


public class Exer7
{

	
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		double a;
		do
		{
			System.out.println(" vous avez une equation du premier degre ecrit sous forme  a.x+b=0  . veuillez entrez la valeur de a different de 0 : ");
			
			a=scn.nextDouble();
			
		}while(a==0);
		
		System.out.println("Saisir la valeur de b : ");
		double b=scn.nextDouble();
		
		double solution= -b/a;
		System.out.println("le solution de l'equation : " +a+".x + " +b+ " est : x = " + solution);
		scn.close();
	}
	
	
}
