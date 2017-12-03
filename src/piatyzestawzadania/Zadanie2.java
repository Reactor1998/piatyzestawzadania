package piatyzestawzadania;
import java.util.Scanner;

public class Zadanie2 {

	public static void main(String[] args) 
	
	{
		Scanner czytaj = new Scanner(System.in);
		
		System.out.println("Któy element ci¹gu fibonacciego mam policzyæ?");
		int a = czytaj.nextInt();
		int wynik = fiboR(a);
		System.out.println(wynik);
		
				
		
		
	}
	
	public static int fiboI (int n )
	{
		int wynik=0;
		int a=0;
		int b=1;
		if(n<2)
		{
			return n;
		}
		for(int i =0; i<n-1;i++)
		{
			wynik = a+b;
			a=b;
			b=wynik;
		}
		return wynik;
		
	}
	public static int fiboR(int n)
	{
		if(n<2)
		{
			return n;
		}
		return fiboR(n-1)+ fiboR(n-2);
	}

}
