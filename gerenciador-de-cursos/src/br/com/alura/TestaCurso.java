package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {


		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");
		
//		javaColecoes.getAulas().add(new Aula("Trabalhando com arryaList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com arryaList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
		
	}

}
