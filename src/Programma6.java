
public class Programma6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * dato un vettore 10,20,100,1,4 stampare il numero maggiore
		 */
		int[] vett = {10,20,100,1,4};
		int max = vett[0];
		for (int i = 0; i < vett.length; i++) {
			if (vett[i]>max) 
				max=vett[i];
		}
		System.out.println(max);
	}
}
