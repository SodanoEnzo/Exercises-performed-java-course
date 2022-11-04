
public class Programma8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * vettore 11,2,40,50
 * stampa la somma dei numeri pari
 */
		int[] vett = {11,2,40,50};
		int sommapari = 0;
		for (int i = 0; i < vett.length; i+=2) {
				sommapari+=vett[i];	
			}
			System.out.println("la somma dei numeri pari e " + sommapari);
		}
	}

