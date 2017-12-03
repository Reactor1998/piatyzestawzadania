package piatyzestawzadania;
import java.util.Scanner;

public class Zadanie9 {

	public static void main(String[] args)
	{
		Scanner czytaj = new Scanner (System.in);
		System.out.println("Podaj tekst , który podzieliæ na s³owa");
		String tekst=czytaj.nextLine();
		int wynik;
		
		//albo podzielNaSlowa(tekst) i zrobic wypisywanie w funkcji
	String []koniec=podzielNaSlowa(tekst);

	
	for(int i=0;i<koniec.length;i++)
	{
		System.out.print(koniec[i]);
	}
	
	}
	
	
	public static String[] podzielNaSlowa(String tekst)
	{
		int licznik =1;
		
	for(int i =0 ; i<tekst.length();i++)
	{
		if (tekst.charAt(i)==' ')
		{
			licznik++;
		}
	}
	String[]slowa = new String[licznik];
	for(int i =0 ; i<licznik;i++)
	{
		slowa[i]="";
	}
	
	licznik =0;
	
	for(int i =0; i < tekst.length();i++)
	{
		if(tekst.charAt(i)==' ')
		{
			licznik++;
			continue;
		}
		slowa[licznik]=slowa[licznik]+tekst.charAt(i);
	}
	for(int i=0;i<slowa.length;i++)
	{
		System.out.print(slowa[i]+",");
	}
		

	return slowa;
	}
}
