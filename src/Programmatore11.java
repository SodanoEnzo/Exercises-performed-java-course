
public class Programmatore11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * vettore di stringhe contare quante parole inziano con la lettera a
		 * {ciao, ala, miao, albero} stampa 2
		 */
		String[] vettStrings = {"ciao", "ala", "miao","albero"};
		int cont = 0;
		String verificaString;
		for (int i = 0; i < vettStrings.length; i++) {
			verificaString = vettStrings[i];
			if (verificaString.charAt(0)== 'a') {
				cont++;
			}
			System.out.println(" numero di parole che inziano con la lettera a sono " + cont);
		}
	}

}
