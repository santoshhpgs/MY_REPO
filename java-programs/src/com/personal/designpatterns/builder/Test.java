package com.personal.designpatterns.builder;

public class Test {

	public static void main(String[] args) {
		HttpClient httpClient = new HttpClient("GET", "http://test.com", null, null, null, null);
		 
		HttpClient httpClientbuilder = new HttpClient.HttpClientBuilder().method("GET").body("http://test.com").build();
	}

}
