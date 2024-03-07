package com;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Inserisci il numero ");
		int a = scan.nextInt();

		System.out.print("Inserisci il secondo numero ");
		int b = scan.nextInt();

		int c = a + b;

		System.out.print("La somma è " + c);

		// ese media

		System.out.print("Inserisci il primo numero ");
		int n1 = scan.nextInt();

		System.out.print("Inserisci il secondo numero ");
		int n2 = scan.nextInt();

		System.out.print("Inserisci il terzo numero ");
		int n3 = scan.nextInt();

		int m = (n1 + n2 + n3) / 3;

		System.out.println("La media è " + m);
	}
}
