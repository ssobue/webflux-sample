package dev.sobue.webflux.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@DisplayName("Test for SampleController")
public class SampleControllerTest {

  @Nested
  @WebFluxTest(controllers = SampleController.class)
  @DisplayName("API Call Tests")
  public class ApiCall {

    @Autowired
    private WebTestClient webClient;

    @Test
    @DisplayName("#index")
    public void testIndex() {
      webClient
          .get()
          .uri("/")
          .exchange()
          .expectStatus().isOk()
          .expectBody()
          .xpath("/html/head/title/text()").exists()
          .xpath("/html/head/title/text()").isEqualTo("Spring WebFlux Demo Page");
    }
  }
}
