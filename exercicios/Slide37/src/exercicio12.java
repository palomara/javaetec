
public class exercicio12 {
	public static void main (String[]args){
		/* Crie uma vari�vel com valor de ponto flutuante com um valor qualquer
		 * e verifique se o valor desta vari�vel est� entre 1.99 e 5.99, inclusive.
		 * Paloma Ranggel - ETEC ZL - 2B INFO NOITE - PC I
		 */
		
		float x = 2.38f;
		
		if (x >= 1.99 && x <= 5.99) {
		System.out.println("A vari�vel X est� entre 1.99 e 5.99");
		}
		else if (x < 1.99) {
		System.out.println("A vari�vel X � menor que 1.99");
		}
		else {
		System.out.println("A vari�vel X � maior que 5.99");	
		}
	}
}
