package com.api_imdb;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

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
		System.out.println(extractedJson);
		
//		Pattern pattern = Pattern.compile("[", "]");
	}

}
