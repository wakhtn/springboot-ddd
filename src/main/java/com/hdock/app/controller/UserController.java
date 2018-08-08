package com.hdock.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hdock.app.domain.entities.User;

@RestController
public class UserController {

   @GetMapping("/user")
   public User getUser() {
      return new User();
   }

}