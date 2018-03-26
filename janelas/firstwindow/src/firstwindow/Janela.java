package firstwindow;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame {

	JLabel lblNome = new JLabel ("Nome:  "); //formulário, campo de texto
	
	public Janela() {
		
	super("Minha Primeira Janela em Java!");
	
	this.setResizable(true); // false - trava alteração do tamanho da janela | true - permite alteração do tamanho da janela
	this.setVisible(true); //visibilidade
	this.setSize(1500,600); //tamanho e largura
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //permite fechar/encerrar a janela
 }
	
	
	public static void main (String [] args) {
		Janela janela = new Janela();
	}
}