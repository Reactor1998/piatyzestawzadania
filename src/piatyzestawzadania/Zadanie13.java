package piatyzestawzadania;
import java.util.Scanner;

public class Zadanie13 {

	public static void main(String[] args)
	{
		
		
		Scanner czytaj=new Scanner(System.in);
		System.out.println("Podaj tekst ktory zamienic");
		String tekst=czytaj.nextLine();
		System.out.println("wporwadz po kolei ciag znakow jak zamienaic");
		int[]kol=new int [tekst.length()];
		
		for(int i =0;i<kol.length;i++)
		{
			System.out.print("Podaj element tablicy");
			kol[i]=czytaj.nextInt();
			
		}
		poprzestawiaj(tekst,kol);
	}

	
	public static String poprzestawiaj(String tekst, int [] kolejnosc)
	{
		
		char[] pom= new char[tekst.length()];
		String wynik="";
		char[]pom2=new char[tekst.length()];
		
		for(int i =0;i<tekst.length();i++)
		{
			pom[i]=tekst.charAt(i);
				
		}
		
		for(int i =0; i<tekst.length();i++)
		{
			pom2[i]=pom[kolejnosc[i]];
		}
		for(int i =0 ;i<tekst.length();i++)
		{
			System.out.print(pom2[i]);
		
		}
	for(int i =0 ; i<tekst.length();i++)
		{
		wynik=wynik+pom2[i];
		
		}
		return wynik;
	}
}

