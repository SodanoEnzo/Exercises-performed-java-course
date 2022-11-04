import java.util.Random;

public class Programma10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * vettore boolean conta quanti valori ci sono true o false
		 * 
		 */
		Random valRandom= new Random();
		boolean[] vettbo = new boolean[6];
		boolean[] vettboolean = {false,true,false};
		int contatorefalse = 0,contatoretrue = 0;;
		for (int i = 0; i < vettboolean.length; i++) {
			if (vettboolean[i]) {
				contatoretrue++;
			} else {
				contatorefalse++;
			}
		}
		System.out.println("i valori true sono " + contatoretrue );
		System.out.println( "i valori false sono " + contatorefalse);
	}

}
