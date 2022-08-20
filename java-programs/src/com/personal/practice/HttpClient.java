package com.personal.practice;

public class HttpClient {
	private String header;
	private String body;
	private String username;

	@Override
	public String toString() {
		return "HttpClient [header=" + header + ", body=" + body + ", username=" + username + "]";
	}

	public HttpClient(HttpClientBuilder httpClientBuilder) {
		header = httpClientBuilder.header;
		body = httpClientBuilder.body;
		username = httpClientBuilder.username;
	}

	public static class HttpClientBuilder {
		private String header;
		private String body;
		private String username;

		public HttpClientBuilder header(String header) {
			this.header = header;
			return this;
		}

		public HttpClientBuilder body(String body) {
			this.body = body;
			return this;
		}

		public HttpClientBuilder username(String username) {
			this.username = username;
			return this;
		}
		
		public HttpClient build() {
			return new HttpClient(this);
		}
	}
}
