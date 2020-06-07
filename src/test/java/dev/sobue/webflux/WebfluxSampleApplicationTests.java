package dev.sobue.webflux;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author ssobue
 * @see WebfluxSampleApplication
 */
@DisplayName("Application Running Test")
class WebfluxSampleApplicationTests {

  @Test
  @DisplayName("Test Loading ApplicationContext")
  void contextLoads() {
    assertDoesNotThrow(() -> WebfluxSampleApplication.main(new String[0]));
  }
}
