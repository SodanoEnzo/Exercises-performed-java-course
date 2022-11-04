
public class Programma4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * dato vettore gia compilato stampare la scritta contiene tutti gli elementi pari 
 * altrimenti non il contiene
 */
		int[] vett = {8,5,12,1};
		
		boolean verifica = true;
		
		for (int i = 0; i < vett.length; i++) {
			if (vett[i]%2 !=0) {
				verifica=false;
				break;
				
		}
		if (verifica) 
			System.out.println("tutti numeri inseriti sono pari");
		else 
		System.out.println("i numeri non sono tutti pari");	
		
		}
	}	
}
