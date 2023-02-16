package assignment1;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

	public static void main(String[] args) {
		try {

			HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://covid-193.p.rapidapi.com/countries"))
					.header("X-RapidAPI-Key", "2cc835529emsh73b3740ff160ae9p14d12ajsn7e5f0fcd4315")
					.header("X-RapidAPI-Host", "covid-193.p.rapidapi.com")
					.method("GET", HttpRequest.BodyPublishers.noBody()).build();
			HttpResponse<String> response = HttpClient.newHttpClient().send(request,
					HttpResponse.BodyHandlers.ofString());
			System.out.println(response.body());

		} catch (

		Exception e) {
			e.printStackTrace();
		}
	}
}
