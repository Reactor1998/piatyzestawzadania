package piatyzestawzadania;

import java.util.Scanner;

public class Zadanie8 {

	public static void main(String[] args) 
	{
		System.out.println("Podaj zdanie, w którym mam policzyæ s³owa");
		Scanner czytaj = new Scanner(System.in);
		String zdanie = czytaj.nextLine();
		int wynik = wordCount(zdanie);
		System.out.println(wynik);
		System.out.print(wordCount(zdanie));

	}
	
	public static int wordCount(String text)
	{
		int suma=1;
		for(int i = 0 ; i < text.length(); i++)
		{
			if(Character.isWhitespace(text.charAt(i)))
			{
				suma = suma +1;
			}
			
		}
		return suma;
	}

}
