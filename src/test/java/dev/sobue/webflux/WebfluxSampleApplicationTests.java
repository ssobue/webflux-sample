package dev.sobue.webflux;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * @author ssobue
 * @see WebfluxSampleApplication
 */
@SpringBootTest
@DisplayName("Application Running Test")
class WebfluxSampleApplicationTests {

  @Autowired
  private ApplicationContext context;

  @Test
  @DisplayName("Test Loading ApplicationContext")
  void contextLoads() {
    assertNotNull(context);
  }
}
