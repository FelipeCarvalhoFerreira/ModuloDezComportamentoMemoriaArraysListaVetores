package ModuloDezComportamentoMemoriaArraysListaVetores;

import java.util.Locale;
import java.util.Scanner;


public class problemaNegativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		double vect [] = new double [n];
		
		
		for (int i = 0; i < n; i++) {
			vect [i] = sc.nextDouble();
			
		}
		
		for (int i = 0; i < n; i++) {
			if ( vect[i] < 0.0) {
				 
				double negativo = vect[i];
				
				System.out.printf("%.2f%n" , negativo);
			}
			
		}
		sc.close();

	}

}
