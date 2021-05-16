package pe.pilseong.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.pilseong.library.model.User;

@Controller
@RequestMapping("/users")
public class UserController {
  
  @PostMapping("/create")
  public String createUser(@ModelAttribute("user") User user) {

    return "main";
  }

  @GetMapping
  public String home() {
    System.out.println("test");

    return "home";
  }
}
