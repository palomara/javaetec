package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Window extends JFrame {
	
	JToolBar toolbar = new JToolBar();
	
	JList ltsEstados;
	JScrollPane scrollpane;
	JScrollPane srcEstado;
	
	
	public Window() {
			
	Container pane = this.getContentPane();
	pane.setLayout(null);
	
	String estados[] = {"SP","RJ","AM","PA","MG"};
	
	ltsEstados = new JList (estados);
	scrollpane = new JScrollPane(ltsEstados);
	
	toolbar.add(new JButton ("Abrir"));
	toolbar.add(new JButton ("Novo"));
	toolbar.add(new JButton("Salvar"));
	toolbar.add(new JButton ("Fechar"));
	
	toolbar.setBounds(0, 0, 500, 40);
	pane.add(toolbar);
	
	scrollpane.setBounds(20, 50, 100, 80);
	pane.add(scrollpane);
	
	String[] coluna = {"Nome", "Cidade", "Estado"};
	
	String[][] dados = {{"Eduardo Jorge", "Salvador", "Bahia"},
						{"Gustavo Neves", "Caetité", "Bahia"},
						{"Tarcísio Araújo", "Mutuípe", "Bahia"},
						{"Rafael", "Campinas", "São Paulo"}
						};
	
	JTable listEstados = new JTable (dados, coluna);
	
	JScrollPane srcEstado = new JScrollPane (listEstados);
	
	srcEstado.setBounds (20, 150, 400, 200);
	pane.add(srcEstado);	
	
	
	this.setLocationRelativeTo(null);
	this.setResizable(true);
	this.setVisible(true);
	this.setSize(500,500);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("Exemplo de Interface");
	
	
	}
	
	public static void main (String[] args) {
		Window firstW = new Window();
	}
	
    
}
