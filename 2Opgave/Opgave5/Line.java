package Opgave5;

import java.util.Scanner;
public class Line {

	public static void main(String[] args){

		int a = 2;
		int b = 10;
		int f�rsteKoordinat;
		int andetKoordinat;
		String l = "y = a*x + b";
		
		Scanner in = new Scanner(System.in);
		System.out.print("Indtast f�rste koordinat.");
		f�rsteKoordinat = in.nextInt();
		System.out.print("Indtast andet koordinat.");
		andetKoordinat = in.nextInt();
		
		System.out.println("Koordinaterne for linjen er: " + f�rsteKoordinat +","+andetKoordinat);
		
		System.out.println("L�ngden p� linjen er :");
		
		
	}
}