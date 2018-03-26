
public class exercicio12 {
	public static void main (String[]args){
		/* Crie uma variável com valor de ponto flutuante com um valor qualquer
		 * e verifique se o valor desta variável está entre 1.99 e 5.99, inclusive.
		 * Paloma Ranggel - ETEC ZL - 2B INFO NOITE - PC I
		 */
		
		float x = 2.38f;
		
		if (x >= 1.99 && x <= 5.99) {
		System.out.println("A variável X está entre 1.99 e 5.99");
		}
		else if (x < 1.99) {
		System.out.println("A variável X é menor que 1.99");
		}
		else {
		System.out.println("A variável X é maior que 5.99");	
		}
	}
}
