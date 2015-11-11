package Opgave3;

public class Skat2{
	
	public static void main(String[] args){
		int indkomst = 120000;
		double ambi = indkomst * 8.0 / 100.0;
		double pension = indkomst * 1.0 / 100.0;
		int personfradrag = 33000;
		
		double nyIndkomst = indkomst-ambi-pension-personfradrag;
		double bundskat = nyIndkomst*7/100;

		System.out.print("Arbejdsmarkedsbidrag: ");
		System.out.println(ambi);
		System.out.print("Særlig pensionsopsparing: ");
		System.out.println(pension);

		System.out.println("Din bundskat er: " + bundskat + " kr.");
	
	}
	
}
/*
Udvid programmet, så det også beregner bundskatten for år 2000 og udskriver resultatet på
skærmen. Indsæt også kommentarer i programmet.
Tip: Bundskatten er 7 % af indkomsten, efter at denne er fratrukket arbejdsmarkedsbidrag (Ambi), 
særligt pensionsbidrag samt personfradrag.
Ambi 8.0 %, Særlig pension 1.0 %, Bundskat 7.0 %, Personfradrag 33.400 kr.
Oversæt og kør programmet.
*/