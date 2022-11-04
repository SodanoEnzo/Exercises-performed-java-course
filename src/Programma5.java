import java.util.Random;

public class Programma5 {
public static void main(String[] args) {
	Random Random = new Random();
	
	int[] vett1 = new int[10];
	boolean verifica = true;
	
	for (int i = 0; i < vett1.length; i++) {
		vett1[i]= Random.nextInt(0,10);
		if (vett1[i]%2 !=0) 
			verifica=false;
	}
	
	if (verifica) {
		System.out.println("tutti numeri inseriti sono pari");
		for (int i = 0; i < vett1.length; i++) {
			System.out.println(vett1[i]);
		}
	}	
	else {
	System.out.println("i numeri non sono tutti pari");	
	for (int i = 0; i < vett1.length; i++) {
		System.out.println(vett1[i]);
	}
	}	
   }
}
