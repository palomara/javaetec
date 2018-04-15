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
	
	//parte superior
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
		
		//barra de menu superior
		menuBar.setBounds(0, 0, 228, 25);
		paine.add(menuBar);
		
		Exibir.setFont( new Font( "Arial", Font.PLAIN, 12 ));
		Exibir.setBounds(1, 5, 45, 20);
		menuBar.add(Exibir);
		Exibir.add(radipadrao);
		Exibir.add(radicienti);
		Exibir.add(radiprograma);
		Exibir.add(radiestatist);
		Exibir.addSeparator();
		Exibir.add("Histórico       Crtl + H");
		Exibir.add(cbAgrupamento);
		Exibir.addSeparator();
		
		Editar.setFont( new Font( "Arial", Font.PLAIN, 12 ));
		Editar.setBounds(46, 5, 45, 20);
		menuBar.add(Editar);
		
		Ajuda.setFont( new Font( "Arial", Font.PLAIN, 12 ));
		Ajuda.setBounds(91, 5, 45, 20);
		menuBar.add(Ajuda);
		
		//visor
		txtVisor.setBounds(20, 40, 171, 50);
		txtVisor.setFont( new Font( "Arial", Font.PLAIN, 20 ));	
		paine.add(txtVisor);
				
		//primeira fileira
		
		btnMC.setBounds(20, 95, 30,25);
		btnMC.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMC.setMargin(new Insets(1,1,1,1));
		paine.add(btnMC);
		btnMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					txtVisor.setText("0");				
			}
		});
		
		btnMR.setBounds(55, 95, 30, 25);
		btnMR.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMR.setMargin(new Insets (1,1,1,1));
		paine.add(btnMR);
		
		btnMS.setBounds(90, 95, 30, 25);
		btnMS.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMS.setMargin(new Insets(1,1,1,1));
		paine.add(btnMS);
		
		btnMais.setBounds(125, 95, 30, 25);
		btnMais.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMais.setMargin(new Insets(1,1,1,1));
		paine.add(btnMais);		
		
		btnMenos.setBounds(160, 95, 30, 25);
		btnMenos.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMenos.setMargin(new Insets(1,1,1,1));
		paine.add(btnMenos);
		
		//segunda fileira
		btnSeta.setBounds(20, 125, 30, 25);
		btnSeta.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnSeta.setMargin(new Insets(1,1,1,1));
		paine.add(btnSeta);
		
		btnCE.setBounds(55, 125, 30, 25);
		btnCE.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnCE.setMargin(new Insets(1,1,1,1));
		paine.add(btnCE);
		
		
		btnC.setBounds(90, 125, 30, 25);
		btnC.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnC.setMargin(new Insets(1,1,1,1));
		paine.add(btnC);
		btnC.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				txtVisor.setText("0");
			}
		});
		
		btnMaisMenos.setBounds(125, 125, 30, 25);
		btnMaisMenos.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMaisMenos.setMargin(new Insets(1,1,1,1));
		paine.add(btnMaisMenos);
		btnMaisMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "maismenos";
				txtVisor.setText("0");
				
			}
		});
		
		btnRaiz.setBounds(160, 125, 30, 25);
		btnRaiz.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnRaiz.setMargin(new Insets(1,1,1,1));
		paine.add(btnRaiz);
		btnRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "raiz";
				txtVisor.setText("0");
				
			}
		});
		
		
		//terceira fileira
		btn7.setBounds(20, 155, 30, 25);
		btn7.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn7.setMargin(new Insets(1,1,1,1));
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
		
		
		btn8.setBounds(55, 155, 30, 25);
		btn8.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn8.setMargin(new Insets(1,1,1,1));
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
		
		btn9.setBounds(90, 155, 30, 25);
		btn9.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn9.setMargin(new Insets(1,1,1,1));
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
		
		btnDiv.setBounds(125, 155, 30, 25);
		btnDiv.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnDiv.setMargin(new Insets(1,1,1,1));
		paine.add(btnDiv);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "divisao";
				txtVisor.setText("0");
				
			}
		});
		
		
		btnPercent.setBounds(160, 155, 30, 25);
		btnPercent.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnPercent.setMargin(new Insets(1,1,1,1));
		paine.add(btnPercent);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());		
				sinal = "porcentagem";
				txtVisor.setText("0");
				
			}
		});	
		
		//quarta fileira
		btn4.setBounds(20, 185, 30, 25);
		btn4.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn4.setMargin(new Insets(1,1,1,1));
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
		
		btn5.setBounds(55, 185, 30, 25);
		btn5.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn5.setMargin(new Insets(1,1,1,1));
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
		
		btn6.setBounds(90, 185, 30, 25);
		btn6.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn6.setMargin(new Insets(1,1,1,1));
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
		
		btnMult.setBounds(125, 185, 30, 25);
		btnMult.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMult.setMargin(new Insets(1,1,1,1));
		paine.add(btnMult);
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "multiplicacao";
				txtVisor.setText("0");
				
			}
		});
		
		
		btnFrac.setBounds(160, 185, 30, 25);
		btnFrac.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnFrac.setMargin(new Insets(1,1,1,1));
		paine.add(btnFrac);
		btnFrac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "fracao";
				txtVisor.setText("0");
				
			}
		});
		
		
		
		//quinta fileira
		btn1.setBounds(20, 215, 30, 25);
		btn1.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn1.setMargin(new Insets(1,1,1,1));
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
		
		btn2.setBounds(55, 215, 30, 25);
		btn2.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn2.setMargin(new Insets(1,1,1,1));
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
		
		btn3.setBounds(90, 215, 30, 25);
		btn3.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn3.setMargin(new Insets(1,1,1,1));
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
		
		btnOMenos.setBounds(125, 215, 30, 25);
		btnOMenos.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnOMenos.setMargin(new Insets(1,1,1,1));
		paine.add(btnOMenos);
		btnOMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					valor1 = Double.parseDouble(txtVisor.getText());
					sinal = "subtracao";
					txtVisor.setText("0");
				
				
			}
		});
		
		
		btnIgual.setBounds(160, 215, 30, 55);
		btnIgual.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnIgual.setMargin(new Insets(1,1,1,1));
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
				if(sinal.equals("porcentagem")) {
					txtVisor.setText(mat.porcentagem(valor1, valor2) + "");	
				}
				
			}
		});
		
		//sexta fileira
		btn0.setBounds(20, 245, 65, 25);
		btn0.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn0.setMargin(new Insets(1,1,1,1));
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
		
		btnVir.setBounds(90, 245, 30, 25);
		btnVir.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnVir.setMargin(new Insets(1,1,1,1));
		paine.add(btnVir);
		
		btnAdi.setBounds(125, 245, 30, 25);
		btnAdi.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnAdi.setMargin(new Insets(1,1,1,1));
		paine.add(btnAdi);
		btnAdi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "soma";
				txtVisor.setText("0");
				
			}
		});
		
		
		this.setSize(228, 322); //padrão 220,311
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	public static void main(String args[]) {
		Calculadora calc = new Calculadora();
	}
}