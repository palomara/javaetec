package view;

import java.awt.Container;

import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import calculo.FuncoesMatematicas;

public class Calculadora extends JFrame{
	
	ButtonGroup tipo = new ButtonGroup ();
	
	JMenu Exibir = new JMenu("Exibir");
	JRadioButtonMenuItem radipadrao = new JRadioButtonMenuItem("Padrão");
	JRadioButtonMenuItem radicienti = new JRadioButtonMenuItem("Científica");
	JRadioButtonMenuItem radiprograma = new JRadioButtonMenuItem("Programador");
	JRadioButtonMenuItem radiestatist = new JRadioButtonMenuItem("Estatística");
	JCheckBoxMenuItem cbAgrupamento = new JCheckBoxMenuItem ("Agrupamento de dígitos");
	
	
	JMenu Editar = new JMenu("Editar");
	JMenu Ajuda = new JMenu("Ajuda");
	
	JMenuBar menuBar = new JMenuBar();
	
	
	JTextField txtVisor = new JTextField("0");
	
	//primeira fileira
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMais = new JButton("M+");
	JButton btnMenos = new JButton("M-");
	//segunda fileira
	JButton btnSeta = new JButton ("<-");
	JButton btnCE = new JButton ("CE");
	JButton btnC = new JButton ("C");
	JButton btnMaisMenos = new JButton ("+-");
	JButton btnRaiz = new JButton ("R");
	//terceira fileira
	JButton btn7 = new JButton ("7");
	JButton btn8 = new JButton ("8");
	JButton btn9 = new JButton ("9");
	JButton btnDiv = new JButton ("/");
	JButton btnPercent = new JButton ("%");
	//quarta fileira
	JButton btn4 = new JButton ("4");
	JButton btn5 = new JButton ("5");
	JButton btn6 = new JButton ("6");
	JButton btnMult = new JButton ("*");
	JButton btnFrac = new JButton ("1/x");
	//quinta fileira
	JButton btn1 = new JButton ("1");
	JButton btn2 = new JButton ("2");
	JButton btn3 = new JButton ("3");
	JButton btnOMenos = new JButton ("-");
	JButton btnIgual = new JButton("=");
	//sexta fileira
	JButton btn0 = new JButton("0");
	JButton btnVir = new JButton(",");
	JButton btnAdi = new JButton("+");
	

	FuncoesMatematicas mat = new FuncoesMatematicas();
	String sinal = null;
	double valor1 = 0, valor2 = 0;
	
	


	public Calculadora() {
		super("Calculadora");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		

		
		txtVisor.setBounds(20, 20, 300, 60);
		paine.add(txtVisor);
		
		
		//primeira fileira
		
		btnMC.setBounds(20,100, 55, 25);
		//btnMC.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		//btnMC.setMargin(new Insets(1,1,1,1));
		//btnMC.setBorder(null);
		//btnMC.setContentAreaFilled(false);
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
		btnC.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				txtVisor.setText("0");
			}
		});
		
		btnMaisMenos.setBounds(200, 140, 55, 25);
		paine.add(btnMaisMenos);
		btnMaisMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "maismenos";
				txtVisor.setText("0");
				
			}
		});
		
		btnRaiz.setBounds(260, 140, 55, 25);
		paine.add(btnRaiz);
		btnRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "raiz";
				txtVisor.setText("0");
				
			}
		});
		
		
		//terceira fileira
		btn7.setBounds(20, 180, 55, 25);
		paine.add(btn7);
		btn7.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("7");
				
				if (txtVisor.getText().equals("0")) {
					
				   txtVisor.setText("7");
				}
			
			else {
				txtVisor.setText(txtVisor.getText() + "7");
			}
		}
	});
		
		
		btn8.setBounds(80, 180, 55, 25);
		paine.add(btn8);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (txtVisor.getText().equals("0")) {
					txtVisor.setText("8");
				}
				else {
					txtVisor.setText(txtVisor.getText() + "8");
				}
			}
		});
		
		btn9.setBounds(140, 180, 55, 25);
		paine.add(btn9);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtVisor.getText().equals("0")) {
					txtVisor.setText("9");
				}
					else {
						txtVisor.setText(txtVisor.getText() + "9");
					}
				
			}
		});
		
		btnDiv.setBounds(200, 180, 55, 25);
		paine.add(btnDiv);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "divisao";
				txtVisor.setText("0");
				
			}
		});
		
		
		btnPercent.setBounds(260, 180, 55, 25);
		paine.add(btnPercent);
		
		//quarta fileira
		btn4.setBounds(20, 220, 55, 25);
		paine.add(btn4);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtVisor.getText().equals("0")) {
					txtVisor.setText("4");
				}
					else {
						txtVisor.setText(txtVisor.getText() + "4");
					}
				
			}
		});
		
		btn5.setBounds(80, 220, 55, 25);
		paine.add(btn5);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtVisor.getText().equals("0")) {
					txtVisor.setText("5");
				}
					else {
						txtVisor.setText(txtVisor.getText() + "5");
					}
				
			}
		});
		
		btn6.setBounds(140, 220, 55, 25);
		paine.add(btn6);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtVisor.getText().equals("0")) {
					txtVisor.setText("6");
				}
					else {
						txtVisor.setText(txtVisor.getText() + "6");
					}
				
			}
		});
		
		btnMult.setBounds(200, 220, 55, 25);
		paine.add(btnMult);
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "multiplicacao";
				txtVisor.setText("0");
				
			}
		});
		
		
		btnFrac.setBounds(260, 220, 55, 25);
		paine.add(btnFrac);
		btnFrac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "fracao";
				txtVisor.setText("0");
				
			}
		});
		
		
		
		//quinta fileira
		btn1.setBounds(20, 260, 55, 25);
		paine.add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtVisor.getText().equals("0")) {
					txtVisor.setText("1");
				}
					else {
						txtVisor.setText(txtVisor.getText() + "1");
					}
				
			}
		});
		
		btn2.setBounds(80, 260, 55, 25);
		paine.add(btn2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtVisor.getText().equals("0")) {
					txtVisor.setText("2");
				}
					else {
						txtVisor.setText(txtVisor.getText() + "2");
					}
				
			}
		});
		
		btn3.setBounds(140, 260, 55, 25);
		paine.add(btn3);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtVisor.getText().equals("0")) {
					txtVisor.setText("3");
				}
					else {
						txtVisor.setText(txtVisor.getText() + "3");
					}
				
			}
		});
		
		btnOMenos.setBounds(200, 260, 55, 25);
		paine.add(btnOMenos);
		btnOMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					valor1 = Double.parseDouble(txtVisor.getText());
					sinal = "subtracao";
					txtVisor.setText("0");
				
				
			}
		});
		
		
		btnIgual.setBounds(260, 260, 55, 65);
		paine.add(btnIgual);
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txtVisor.getText());

				if(sinal.equals("soma")) {
					txtVisor.setText(mat.soma(valor1, valor2) + "");
				}
				
				if(sinal.equals("subtracao")) {
					txtVisor.setText(mat.subtracao(valor1, valor2) + "");
				}
				//System.out.println(sinal);
				if(sinal.equals("multiplicacao")) {
					txtVisor.setText(mat.multiplicacao(valor1, valor2) + "");
				}
				if(sinal.equals("divisao")) {
					txtVisor.setText(mat.divisao(valor1, valor2) + "");
				}
				if(sinal.equals("maismenos")) {
					txtVisor.setText(mat.maismenos(valor1, valor2) + "");
				}
				if(sinal.equals("raiz")) {
					txtVisor.setText(mat.raiz(valor1) + "");
				}
				if(sinal.equals("fracao")) {
					txtVisor.setText(mat.fracao(valor1) + "");
				}
				
			}
		});
		
		//sexta fileira
		btn0.setBounds(20,300,115,25);
		paine.add(btn0);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtVisor.getText().equals("0")) {
					txtVisor.setText("0");
				}
					else {
						txtVisor.setText(txtVisor.getText() + "0");
					}
				
			}
		});
		
		btnVir.setBounds(140,300,55,25);;
		paine.add(btnVir);
		
		btnAdi.setBounds(200,300,55,25);
		paine.add(btnAdi);
		btnAdi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "soma";
				txtVisor.setText("0");
				
			}
		});
		
		
		this.setSize(350, 380); //padrão 220,311
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	public static void main(String args[]) {
		Calculadora calc = new Calculadora();
	}
}