import java.util.Arrays;

public class exercicio15 {
	public static void main (String[]args) {
		/* crie um programa que receba dois argumentos (nomes) e os exiba 
		 * em ordem alfab�tica.
		 * Paloma Rangel Rocha - INFO - 2B - NOITE
		 */
		
		String [] nome = {"Paloma", "Ana"};
		Arrays.sort(nome);
		
		System.out.printf("Ordem alfab�tica: %s ", Arrays.toString(nome));
	}
}
