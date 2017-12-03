package piatyzestawzadania;

import java.util.Scanner;

public class Zadanie7 {

	public static void main(String[] args) 
	{
		System.out.print("podaj zdanie ");
		Scanner reader = new Scanner(System.in);
		String zdanie = reader.nextLine();
		System.out.print("podaj zdanie ktore mam sprawdzic czy zawiera sie w zadnia 1 ");
		String zdanie2 = reader.nextLine();
		int wynik = strfind(zdanie,zdanie2);
		System.out.println(wynik);

	}

	public static int strfind(String gdzie, String co)
	{
		int wynik =gdzie.indexOf(co);
		
		
		return wynik;
	}
}
