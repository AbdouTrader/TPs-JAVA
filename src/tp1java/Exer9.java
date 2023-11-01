package tp1java;
import java.util.Scanner;

public class Exer9
{
	
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		
		System.out.println(" Entrez le montant origine des produits");
		double montantOrigine= scn.nextDouble();
		double montantPayer;
		if( montantOrigine < 5000)
		{
			montantPayer= montantOrigine * 0.05 ;
			System.out.println("le montant que tu dois payer est :" + montantPayer);
		}
		else if(montantOrigine >=5000 && montantOrigine<8000)
		{
			montantPayer= montantOrigine * 0.08 ;
			System.out.println("le montant que tu dois payer est :" + montantPayer);
		}
		else if(montantOrigine >= 8000)
		{
			montantPayer= montantOrigine * 0.1 ;
			System.out.println("le montant que tu dois payer est :" + montantPayer);
		}
			
		scn.close();	
			
		
	}
}
