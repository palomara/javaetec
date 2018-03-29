package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame{
	
	JTextField txtVisor = new JTextField();
	
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMais = new JButton("M+");
	JButton btnMenos = new JButton("M-");
	JButton btnSeta = new JButton ("<-");
	JButton btnCE = new JButton ("CE");
	JButton btnC = new JButton ("C");
	JButton btnMaisMenos = new JButton ("+-");
	JButton btnRaiz = new JButton ("R");
	JButton btn7 = new JButton ("7");
	JButton btn8 = new JButton ("8");
	JButton btn9 = new JButton ("9");
	JButton btnDiv = new JButton ("/");
	JButton btnPercent = new JButton ("%");
	JButton btn4 = new JButton ("4");
	JButton btn5 = new JButton ("5");
	JButton btn6 = new JButton ("6");
	JButton btnMult = new JButton ("*");
	JButton btnFrac = new JButton ("1/x");
	JButton btn1 = new JButton ("1");
	JButton btn2 = new JButton ("2");
	JButton btn3 = new JButton ("3");
	JButton btnOMenos = new JButton ("-");
	
	
	


	public Calculadora() {
		super("Calculadora");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		txtVisor.setBounds(20, 20, 300, 60);
		paine.add(txtVisor);
		
		
		//primeira fileira
		
		btnMC.setBounds(20,100, 55, 25);
		paine.add(btnMC);
		
		btnMR.setBounds(80, 100, 55, 25);
		paine.add(btnMR);
		
		btnMS.setBounds(140, 100, 55, 25);
		paine.add(btnMS);
		
		btnMais.setBounds(200,100, 55, 25);
		paine.add(btnMais);		
		
		btnMenos.setBounds(260, 100, 55, 25);
		paine.add(btnMenos);
		
		//segunda fileira
		btnSeta.setBounds(20, 140, 55, 25);
		paine.add(btnSeta);
		
		btnCE.setBounds(80, 140, 55, 25);
		paine.add(btnCE);
		
		btnC.setBounds(140, 140, 55, 25);
		paine.add(btnC);
		
		btnMaisMenos.setBounds(200, 140, 55, 25);
		paine.add(btnMaisMenos);
		
		btnRaiz.setBounds(260, 140, 55, 25);
		paine.add(btnRaiz);
		
		
		//terceira fileira
		btn7.setBounds(20, 180, 55, 25);
		paine.add(btn7);
		
		btn8.setBounds(80, 180, 55, 25);
		paine.add(btn8);
		
		btn9.setBounds(140, 180, 55, 25);
		paine.add(btn9);
		
		btnDiv.setBounds(200, 180, 55, 25);
		paine.add(btnDiv);
		
		btnPercent.setBounds(260, 180, 55, 25);
		paine.add(btnPercent);
		
		//quarta fileira
		btn4.setBounds(20, 220, 55, 25);
		paine.add(btn4);
		
		btn5.setBounds(80, 220, 55, 25);
		paine.add(btn5);
		
		btn6.setBounds(140, 220, 55, 25);
		paine.add(btn6);
		
		btnMult.setBounds(200, 220, 55, 25);
		paine.add(btnMult);
		
		btnFrac.setBounds(260, 220, 55, 25);
		paine.add(btnFrac);
		
		//quinta fileira
		btn1.setBounds(20, 260, 55, 25);
		paine.add(btn1);
		
		btn2.setBounds(80, 260, 55, 25);
		paine.add(btn2);
		
		btn3.setBounds(140, 260, 55, 25);
		paine.add(btn3);
		
		btnOMenos.setBounds(200, 260, 55, 25);
		paine.add(btnOMenos);
		
		
		
		this.setSize(350, 500); //padrão 220,311
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
	}
	public static void main(String args[]) {
		Calculadora calc = new Calculadora();
	}
}