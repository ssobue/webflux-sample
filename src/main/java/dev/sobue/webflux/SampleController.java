package dev.sobue.webflux;

import java.util.Collections;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Sample Controller.
 *
 * @author ssobue
 */
@Controller
public class SampleController {

  /**
   * Index Page.
   *
   * @param model model for view
   * @return view name
   */
  @GetMapping
  public String index(Model model) {
    model.addAllAttributes(Collections.singletonMap("title", "Spring WebFlux Demo Page"));
    return "index";
  }
}
