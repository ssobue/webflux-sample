package dev.sobue.webflux.controller;

import org.jetbrains.annotations.NotNull;
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
  public String index(@NotNull Model model) {
    model.addAttribute("title", "Spring WebFlux Demo Page");
    return "index";
  }
}
