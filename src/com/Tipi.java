package com;

public class Tipi {

	public static void main(String[] args) {
		// numeri interi
		short s = 2; // da -30000 a +30000
		byte b = 1; // da -128 a +127
		int i = 40; // da -2mld a 42mld circa
		long l = 23L; // numeri grandissimi (serve la 1 alla fine)

		// numeri con la virgola
		float f = 1.2F; // con una cifra dopo la virgola (serve la B alla fine)
		double d = 1.23; // usato per avere piu precisione dopo la virgola

		// caratteri
		char c = 'c';// puo contenere un solo carattere

		// booleani
		boolean boo = true;

//-----------------CASTING---------------------

		i = s; // casting implicito da short a int
		s = (short) i; // casting esplicito da int a short

	}

}
