package listarNomes;

import javax.swing.JOptionPane;

import metodos.Servicos;

public class principal {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		String linha = "";
		while(!linha.equals("sair")){
			linha = JOptionPane.showInputDialog(null,"Digite a frase que deseja criptografar, "
					+ "para sair digite 'sair'", "Entrada",JOptionPane.INFORMATION_MESSAGE);
			buffer.append(linha + "\r\n");
		}
		Servicos.criptografar(buffer.toString());
	}
}
