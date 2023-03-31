package com.vetapp.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignInController {
  
  @PostMapping("/sign-in")
  public void signIn(@RequestParam String username, @RequestParam String password) {
    System.out.println("Username: " + username + " Password: " + password);
  }
  
}

