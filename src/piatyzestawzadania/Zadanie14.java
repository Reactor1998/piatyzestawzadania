package piatyzestawzadania;
import java.util.Scanner;

public class Zadanie14 {

	public static void main(String[] args)
	{
		
		Scanner czytaj = new Scanner (System.in);
		System.out.println("Podaj pierwszy wyraz");
		
		String t1=czytaj.next();
		
		System.out.println("Podaj drugi wyraz");
		
		String t2=czytaj.next();
	System.out.print(czyAnagram(t1,t2));
	
		
	}
	
	public static boolean czyAnagram(String t1, String t2)
	{
		
	boolean anagram=true;
	if(t1.length()!=t2.length())
	{
		anagram=false;
	}
	
	for(int i =0 ; i<t1.length();i++)
	{
		if(t2.indexOf(t1.charAt(i))==-1)
		{
			anagram=false;
		}
	}
	
	return anagram;
	
}
}

