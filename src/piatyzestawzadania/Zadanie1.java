package piatyzestawzadania;
import java.util.Scanner;

public class Zadanie1 {

	public static void main(String[] args) 
	{
		Scanner czytaj= new Scanner(System.in);
		
		System.out.println("Podaj liczbe z której mam policzyæ silnie");
		
		int n= czytaj.nextInt()	;
		int wynik = silniarek(n);
		System.out.println(silniarek(n));
		
	}

	//public static int silniaiter (int n)
	//{
	//	int silnia=1;
		
	//	for(int i =1 ; i<=n;i++)
	//	{
	//		silnia=silnia*i;
	//	}
	//	return silnia;
	
	//}
	public static int silniarek (int n)
	{
		
	
		if(n == 0) return 1;
		return n*silniarek(n-1);
		
	}
}
