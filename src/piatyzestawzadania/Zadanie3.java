package piatyzestawzadania;

import java.util.Scanner;

public class Zadanie3 {

	public static void main(String[] args) 
	{
		Scanner czytaj = new Scanner(System.in);
		int wynik=0;
		
		String tekst;
		System.out.println("Podaj tekst");
		tekst=czytaj.nextLine();
		System.out.println("Podaj znak , od którego mam wskazac indeks");
		char znak = czytaj.next().charAt(0);
		wynik=strpos(tekst,znak);
		System.out.println(wynik);

	}
	
	public static int strpos(String text, char z)
	{
		int wynik;
		
		for ( int i= 0 ;i<text.length();i++)
		{
			if(text.charAt(i)==z)
			{
				wynik=i;
				return wynik;
			}
		
		}
		return -1;
	}

}
