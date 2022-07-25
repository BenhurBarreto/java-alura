package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		int a = 3;
		String nome = "Alura"; // object literal
		
//		String outro = new String("Alure");
		
//		String outro = nome.replace("A", "a");
		
//		String outro = nome.replace('A', 'a');
		
//		String outro = nome.replace("A", "aL");
		
//		String outro = nome.toLowerCase();
		
//		String outro = nome.toUpperCase();
		
//		char outro = nome.charAt(2); // posicao
		
//		int outro = nome.indexOf("ur");
		
		String outro = nome.substring(1);
		
		System.out.println(nome);
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		String vazio = "     Aluration   ";
		System.out.println(vazio);
		System.out.println(vazio.isEmpty());
		String outroVazio = vazio.trim();
		System.out.println(outroVazio);
		System.out.println(vazio.contains("Alu"));
		
		
		System.out.println(outro);
	}

}
