package piatyzestawzadania;
import java.util.Scanner;

public class Zadanie11 {

	public static void main(String[] args)
	{
		Scanner czytaj = new Scanner( System.in);
		System.out.println("Podaj ci¹g znaków");
		String ciag=czytaj.nextLine();
		System.out.println("Podaj od jakiego indeksu mam wyci¹æ tekst");
		int od = czytaj.nextInt();
		System.out.println("Podaj ile znaków mam wyci¹æ");
		int ile = czytaj.nextInt();
		
		System.out.println(strcut(ciag,od,ile));
		

	}
	
	public static String strcut(String str, int start, int ile)
	{
		String wynik1="";
		String wynik2="";
		String wynik="";
		wynik1=str.substring(0,start);
		wynik2=str.substring(start+ile,str.length());
		wynik=wynik1 +wynik2;
		return wynik;
	}

}
