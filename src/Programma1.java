import java.util.Scanner;

public class Programma1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyScanner = new Scanner(System.in);
		
		int index = 0, numutente,somma=0;
		
		do {
			System.out.println("inserisci quanti numeri vuoi inserire");
			numutente= keyScanner.nextInt();
		} while (numutente<3 || numutente>10);
		
		int[]vettint = new int[numutente];
		System.out.println("vuoi inseriire " + numutente);
			
			while (index<vettint.length) {
				System.out.println("inserisci numero");
				vettint[index]= keyScanner.nextInt();
				index++;
		}
		
			System.out.println("hai inserito i seguenti numeri");
			index=0;
			while (index<vettint.length) {
				System.out.println(vettint[index]);
				somma+=vettint[index];
				index++;
		}
		System.out.println("la somma dei numeri inseriti e " + somma);
		keyScanner.close();
	}

}
