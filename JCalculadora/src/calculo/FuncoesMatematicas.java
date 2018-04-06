package calculo;

import view.Calculadora;

public class FuncoesMatematicas extends Calculadora {
	
	public double soma (double a, double b) {
		double total = a + b;
		return total;
	}	
		public double subtracao(double c, double d){
			double total = c - d;
			return total;
		}
		
		public double multiplicacao(double e, double f){
			//double total = 0;
			double total = e * f;
			return total;
		}
		
		public double divisao(double g, double h){
			double total = g / h;
			return total;
		}
	}
	
