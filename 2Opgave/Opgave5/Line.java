package Opgave5;

import java.util.Scanner;
public class Line {

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int f�rsteKoordinat;
		int andetKoordinat;
		System.out.print("Indtast f�rste koordinat.");
		f�rsteKoordinat = in.nextInt();
		System.out.print("Indtast andet koordinat.");
		andetKoordinat = in.nextInt();
		
		System.out.println("Koordinaterne for linjen er: " + f�rsteKoordinat +","+andetKoordinat);
		
		
	}
}