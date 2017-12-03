package piatyzestawzadania;
import java.util.Scanner;

public class Zadanie5 {

	public static void main(String[] args)
	{
		Scanner czytaj = new Scanner(System.in);
		System.out.println("Podaj pierwszy napis");
		String napis1 = czytaj.nextLine();
		
		System.out.println("Podaj drugi napis , ¿eby sprawdziæ czy jest prefiksem");
		String napis2= czytaj.nextLine();
		boolean wynik = startsWith(napis1,napis2);
		System.out.println(wynik);
		

	}

	
	public static boolean startsWith(String str1, String str2)
	{
		boolean czyPrefiks= false;
		
		
		for(int i = 0 ;i<str2.length();i++)
		{
			if(str1.charAt(i)==str2.charAt(i))
			{
				czyPrefiks=true;
			}
			else czyPrefiks=false;
		}
		return czyPrefiks;
	}
}
