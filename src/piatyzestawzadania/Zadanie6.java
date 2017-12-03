package piatyzestawzadania;
import java.util.Scanner;


public class Zadanie6 {

	public static void main(String[] args)
	{
		System.out.print("podaj zdanie zawierajace cyfry");
		Scanner reader = new Scanner(System.in);
		String zdanie = reader.nextLine();
		int wynik = strToInt(zdanie);
		System.out.println(wynik);

	}
	public static int strToInt(String str)
	{
		String liczba="";
		int wynik=0;
	
		for(int i = 0 ; i < str.length(); i ++)
		{
			if (Character.isDigit(str.charAt(i))==true)
			{
				liczba=liczba+str.charAt(i);
				
			}
		}
		
		int konwertowana;
		konwertowana = Integer.parseInt(liczba);
		
		
		return konwertowana;

}
}
