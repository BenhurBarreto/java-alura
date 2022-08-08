package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita2 {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de entrada com arquivo
		
//		OutputStream fos = new FileOutputStream("lorem22.txt");		
//		Writer osw = new OutputStreamWriter(fos);		
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.write(System.lineSeparator());
		bw.write(System.lineSeparator());
		bw.write("Fechando");
		
		bw.close();
	}

}