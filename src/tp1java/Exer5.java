package tp1java;
import java.util.Scanner;

public class Exer5

{
	
		public static void main(String[] args)
		{
			System.out.println("Saisir le nombre 1 : ");
			Scanner scn=new Scanner(System.in);
			double n1=scn.nextDouble();
			
			System.out.println("Saisir le nombre  2 : ");
			
			double n2=scn.nextDouble();
			
			if(n1>n2)
			{
				System.out.println("le maximum des deux nombres " + n1 + "  et  " +n2+ " est : " + n1);
			}
			else if(n1<n2)
				System.out.println("le maximum des deux nombres " + n1 + "  et  " +n2+ " est : " + n2);
			else
				
				System.out.println("les deux nombres " + n1 + "  et  " +n2+ "est :  sont egaux " );
			scn.close();
		}
		

}
