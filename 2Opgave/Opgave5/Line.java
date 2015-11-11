package Opgave5;

import java.util.Scanner;
public class Line {

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int førsteKoordinat;
		int andetKoordinat;
		System.out.print("Indtast første koordinat.");
		førsteKoordinat = in.nextInt();
		System.out.print("Indtast andet koordinat.");
		andetKoordinat = in.nextInt();
		
		System.out.println("Koordinaterne for linjen er: " + førsteKoordinat +","+andetKoordinat);
		
		
	}
}