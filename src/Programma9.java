import java.util.Scanner;

public class Programma9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * vettore 10,30,5,2
		 * numero input determinare quanti numeri sono multipli del numero inserito
		 */
		 
		Scanner keyScanner = new Scanner(System.in);
		int[]vett = {10,30,5,2};
		int numutente;
		int multipli = 0;
		System.out.println("inserisci numero per verificare se un multiplo");
		numutente= keyScanner.nextInt();
		for (int i = 0; i < vett.length; i++) {
			if (vett[i] % numutente == 0) {
				multipli++;
			}
		}
		System.out.println("i multipli del numero inserito e " + multipli);
		keyScanner.close();
	}

}
