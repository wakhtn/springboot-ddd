package com.hdock.app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class BotController {

   @GetMapping("/bot")
   public String test() {
      System.out.println("test");
      return "Hello Spring Boot2222";
   }

   @GetMapping("/bot/list")
   public String test2() {
      return "Hello Spring Boot Servlet 2";
   }
}