package com.jot;

import com.jot.httpclients.PostsClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@SpringBootApplication
public class Spring6DeclarativeHhtpInterfacesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring6DeclarativeHhtpInterfacesApplication.class, args);
	}

	private String serviceUrl = "https://jsonplaceholder.typicode.com/";

	@Bean
	public WebClient createWebClient(){
		WebClient webClient = WebClient.builder()
				.baseUrl(serviceUrl)
				.build();
		return webClient;
	}

	@Bean
	public HttpServiceProxyFactory createProxyFactory(WebClient webClient){
		return HttpServiceProxyFactory.builder(WebClientAdapter.forClient(webClient)).build();
	}

	@Bean
	public PostsClient createPostsClient(HttpServiceProxyFactory httpServiceProxyFactory ){
		return httpServiceProxyFactory.createClient(PostsClient.class);
	}

}
