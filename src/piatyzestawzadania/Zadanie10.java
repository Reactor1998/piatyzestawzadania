package piatyzestawzadania;
import java.util.Scanner;

public class Zadanie10 {

	public static void main(String[] args) 
	{
		Scanner czytaj = new Scanner(System.in);
		System.out.println("Podaj ci�g znak�w w kt�ym mam zliczy� dany podci�g");
		String gdzie=czytaj.nextLine();
		System.out.println("Podaj podciag , kt�rego ilos� wyst�powania mam zliczy�");
		String co =czytaj.nextLine();
		System.out.println(strFindAndCount(gdzie,co));

	}
	public static int strFindAndCount(String gdzie, String co) 
	{
		int suma=0;
		for(int i =0;i<gdzie.length()-1;i++)
		{
			for(int j=0;j<co.length()-1;j++)
			{
				if(gdzie.charAt(i)==co.charAt(j)&&gdzie.charAt(i+1)==co.charAt(j+1))
					suma++;
			}
			
		}
		return suma;
	}

}
