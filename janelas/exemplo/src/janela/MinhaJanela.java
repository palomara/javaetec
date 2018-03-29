package janela;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MinhaJanela extends JFrame {

	JLabel lblDescr = new JLabel ("Preencha os campos e clique em Gravar Dados");
	
	JLabel lblNome = new JLabel ("Nome: "); 
	JTextField txtNome = new JTextField(); //JTextField = texto dentro da janela
	
	JLabel lblEndereco = new JLabel ("Endereço: "); 
	JTextField txtEndereco = new JTextField();
	
	JLabel lblBairro = new JLabel ("Bairro: "); 
	JTextField txtBairro = new JTextField ();
	
	JLabel lblEstado = new JLabel ("Estado: ");
	JPanel txtEstado = new JPanel();
	
	JLabel lblTelefone = new JLabel ("Telefone: ");
	JTextField txtTelefone = new JTextField ();
	
	JLabel lblCelular = new JLabel ("Celular: ");
	JTextField txtCelular = new JTextField ();
	
	JLabel lblEmail = new JLabel ("Email: ");
	JTextField txtEmail = new JTextField ();
	
	JButton button1 = new JButton ("Gravar Cadastro");
	JButton button2 = new JButton ("Novo Cadastro");
	JButton button3 = new JButton ("Ver Cadastros");
	
	JComboBox cboestado = new JComboBox();
	
	public MinhaJanela() {
		super ("Cadastro de Clientes");
		
		Container paine = this.getContentPane(); //classe que posiciona objetos e elementos na tela
		paine.setLayout(null); //define layout como "nenhum"
		
		lblDescr.setBounds(20, 20, 400, 25); //.setBounds eixo x, y, tamanho horizontal, tamanho vertical
		paine.add(lblDescr); //paine.add adiciona na janela
		
		paine.add(lblNome);
		lblNome.setBounds(20, 50, 40,25);
		paine.add(txtNome);
		txtNome.setBounds(100, 50, 200, 25);
		
		
		paine.add(lblEndereco);
		lblEndereco.setBounds(20, 80, 200, 25);; //x, y , largura, altura
		paine.add(txtEndereco);
		txtEndereco.setBounds(100, 80, 200, 25);
		
		paine.add(lblBairro);
		lblBairro.setBounds(20, 110, 200, 25);
		paine.add(txtBairro);
		txtBairro.setBounds(100,110 ,200,25);
		
		paine.add(lblEstado);
		lblEstado.setBounds(20, 140, 200, 25);
		paine.add(txtEstado);
		txtEstado.setBounds(100, 140, 200, 25);
		
	
		paine.add(lblTelefone);
		lblTelefone.setBounds(20, 170, 150, 25);
		paine.add(txtTelefone);
		txtTelefone.setBounds(100, 170, 100, 25);
		
		paine.add(lblCelular);
		lblCelular.setBounds(20, 200, 150, 25);
		paine.add(txtCelular);
		txtCelular.setBounds(100,200, 100, 25);
		
		
		paine.add(lblEmail);
		lblEmail.setBounds(20, 230, 200, 25);
		paine.add(txtEmail);
		txtEmail.setBounds(100, 230, 200, 25);
		
		paine.add(button1);
		button1.setBounds(20, 270, 130, 40);
		paine.add(button2);
		button2.setBounds(160, 270, 130, 40);
		paine.add(button3);
		button3.setBounds(300, 270, 130, 40);
				
		paine.add(cboestado);
		cboestado.addItem("SP");
		cboestado.addItem("RJ");
		cboestado.addItem("SC");
		cboestado.addItem("RS");
		txtEstado.add(cboestado);
		
		this.setResizable(false);
		this.setVisible(true);
		this.setSize(480,380);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Cadastro de Clientes");
	}
	public static void main (String[] args) {
		MinhaJanela janela1 = new MinhaJanela();
	}
}
