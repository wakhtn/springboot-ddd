package com.hdock.app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RootController {

   @RequestMapping("/")
   public String rootControll() {
      return "version 1.0.0. environement=d";
   }

}