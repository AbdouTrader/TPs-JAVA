package tp1java;
import java.util.Scanner;


public class Exer15
{
	public static void main(String[] args)
	{
		System.out.println(" combien de ligne tu veut dans votre triangle : ");
		Scanner scan= new Scanner(System.in);
		int ligne=scan.nextInt();
		
		
		for(int i=0;i<ligne;i++)
		{
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
			
			
		}
		scan.close();
		
	}
}
