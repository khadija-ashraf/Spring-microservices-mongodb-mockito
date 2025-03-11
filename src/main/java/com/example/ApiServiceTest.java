//package com.example;
//
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.web.reactive.function.client.WebClient;
//
//import reactor.core.publisher.Mono;
//
//public class ApiServiceTest {
//
//	@Mock
//	private WebClient webClient;
//
//	@InjectMocks
//	private ApiService apiService;
//	
//	public ApiServiceTest() {
//		MockitoAnnotations.openMocks(this);
//	}
//	
//	@Test
//	void testGetUser() {
//		WebClient.RequestHeadersUriSpec<?> uriSpec = mock(WebClient.RequestHeadersUriSpec.class);
//		WebClient.RequestHeadersSpec<?> headersSpec = mock(WebClient.RequestHeadersSpec.class);
//		WebClient.ResponseSpec responseSpec = mock(WebClient.ResponseSpec.class);
//		
//		when(webClient.get()).thenReturn(mock(WebClient.RequestHeadersUriSpec.class));
//        when(uriSpec.uri(anyString())).thenReturn(mock(WebClient.RequestHeadersSpec.class));
//        when(headersSpec.retrieve()).thenReturn(responseSpec);
//        when(responseSpec.bodyToMono(String.class)).thenReturn(Mono.just("{ \"name\": \"John Doe\" }"));
//
//	}
//
//}
