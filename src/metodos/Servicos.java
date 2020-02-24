package metodos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Servicos {
	public static void gravarCriptografia(String conteudo) throws IOException {
		boolean arquivoExiste = false;
		File dir = new File("C:\\TEMP\\");
		File arquivo = new File("C:\\TEMP\\criptografia.txt");
		if(dir.exists()){
			if(arquivo.exists()){
				arquivoExiste = true;
			}
			FileWriter fw = new FileWriter(arquivo, arquivoExiste);
			PrintWriter pw = new PrintWriter(fw);
			pw.write(conteudo);
			pw.flush();
			pw.close();
			fw.close();
		}
	
	}
	public static void criptografar(String insercao) {
		int count = 0;
		String mostra = "";
		String mat[][] = new String[9][2];
		int l = 0;
		String enviar = "";
		mat = PreencheMatriz(mat);
		insercao = insercao.toUpperCase();
		while(insercao.length() != count) {
			mostra = insercao.substring(count, count + 1);
	        for(l= 0; l<8; l++){
				if(mostra.equals(mat[l][0])) {
					mostra = mat[l][1];
				}
	        }
			System.out.println(mostra);
			enviar += mostra;
			count++;
		}
		try {
			gravarCriptografia(enviar);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String[][] PreencheMatriz(String[][] mat) {
		mat[0][0] = "O";
		mat[0][1] = "0";
		
		mat[1][0] = "I";
		mat[1][1] = "1";
		
		mat[2][0] = "Z";
		mat[2][1] = "2";
		
		mat[3][0] = "E";
		mat[3][1] = "3";
		
		mat[4][0] = "A";
		mat[4][1] = "4";
		
		mat[5][0] = "S";
		mat[5][1] = "5";
		
		mat[6][0] = "G";
		mat[6][1] = "6";
		
		mat[7][0] = "T";
		mat[7][1] = "7";
		
		mat[8][0] = "B";
		mat[8][1] = "8";
		return mat;
	}
}

