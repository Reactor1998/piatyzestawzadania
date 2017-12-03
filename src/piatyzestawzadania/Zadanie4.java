package piatyzestawzadania;
import java.util.Scanner;


public class Zadanie4 {

	public static void main(String[] args)
	{
		Scanner czytaj = new Scanner (System.in);
		System.out.println("Podaj tekst, w którym mam zamieniæ litery");
		String tekst= czytaj.nextLine();
		String tekst2= flipCase(tekst);
		System.out.print(tekst2);
		
	}

	
	public static String flipCase(String text)
	{
		String text2="";
		for(int i = 0 ; i< text.length(); i++)
		{
		if( Character.isLowerCase(text.charAt(i))==false)				
			{
			char c=Character.toLowerCase(text.charAt(i));
			
			text2=text2 +c;
			}
		else if (Character.isUpperCase(text.charAt(i))==false)
		{
			char d=Character.toUpperCase(text.charAt(i));
			text2=text2+d;		
		}
		}
		return text2;
}
}
