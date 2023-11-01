package tp1java;
import java.util.Scanner;

public class Exer8 
{

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		double a;
		do
		{
			System.out.println(" vous avez une equation du premier degre ecrit sous forme  a.x^2+b.x+c=0  . veuillez entrez la valeur de a different de 0 : ");
			
			a=scn.nextDouble();
			
		}while(a==0);
		
		System.out.println("Saisir la valeur de b : ");
		double b=scn.nextDouble();
		
		System.out.println("Saisir la valeur de c : ");
		double c=scn.nextDouble();
		double delta= b*b-(4*a*c);
		if(delta>0)
		{
			double x1=(-b + Math.sqrt(delta))/(2*a);
			double x2=(-b - Math.sqrt(delta))/(2*a);
			System.out.println(" l'equation admis deux solutions : x1 = "+ x1+ " et x2 = " + x2);
		}
		else if(delta==0)
		{
			 double x = -b/(2*a);
			 System.out.println(" l'equation admis une solution : x = "+ x);
		}
		else
			System.out.println("pas de solution reel !!");
		
		scn.close();
	}

}
