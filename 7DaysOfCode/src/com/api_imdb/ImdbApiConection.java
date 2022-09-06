package com.api_imdb;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class ImdbApiConection {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest
	            .newBuilder()
	            .uri(new URI("https://imdb-api.com/en/API/Top250Movies/k_jfp8naw7"))
	            .GET()
	            .build();
		System.out.println(request);
		
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		
		String json = response.body();
		String extractedJson = json.substring(json.lastIndexOf("[") + 1, json.indexOf("]"));
//		System.out.println(extractedJson);
		
//		Pattern regex = Pattern.compile("\\{\\}");
//		Matcher regexMatcher = regex.matcher(extractedJson);
//		List<String> matchList = new ArrayList<String>();
//		
//		while (regexMatcher.find()) {//Finds Matching Pattern in String
//			   matchList.add(regexMatcher.group(1));//Fetching Group from String
//		}
		
		String[] jsonFilmes = extractedJson.split("[\\\\\\\\\\\\{\\\\\\\\\\\\}\\\\\\\\\\\\]");
		// tentei de todas as formas preservar a estrutura do filme em json com {}, mas não sonsegui 
		// utilizando o método split(). Não conseguir intender completamente os critérios de seleção,
		// os delimitadores do método para divisão da String. 
		// Como resultado, a forma que implementei conseguiu extrair o conteúdo do json de cada filme
		// sem as chaves {} mas também, a vírgula. Esta eu não consegui remover pelos delimitadores.
		// Há a necessidade de estudar mais sobre estes delimitadores. Para contornar a situação,
		// criei uma um filtro para remover os caracteres menores ou igual a 1 e adicionei a uma nova
		// lista os stringd maiores que este valor. Possuo, como resultados agora, um array com 250 
		// posições como era esperado pelo desafio. Antes deesse filtro, tinha um array de 500 posições
		// devido ao split não conseguir filtrar a vírgula.
		
		List<String> filmes = new ArrayList<String>();
		
		for(String filme:jsonFilmes) {
			if(filme.length() <= 1) {
				
			} else {
				System.out.println(filme);
				filmes.add(filme);
			}

		}
		System.out.println(jsonFilmes.length);
		System.out.println(filmes.size());
		
//		System.out.println(jsonFilmes[0].length());
//		System.out.println(jsonFilmes[1].length());
//		System.out.println(jsonFilmes[2].length());
//		System.out.println(jsonFilmes[3].length());
//		System.out.println(jsonFilmes[499].length());
		
		
//		Pattern pattern = Pattern.compile("}|,|{");
//		String[] jsonFilmes = pattern.split(extractedJson);
		
//		Pattern pattern = Pattern.compile("[", "]");
		
		
	}

}
