package com.hdock.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

import com.hdock.app.domain.entities.UserEntity;
import com.hdock.app.rest.impl.GetUserResponseImpl;

@RestController
public class UserController {
   @GetMapping("/v1/user")
   public GetUserResponseImpl getUser() {
      return new GetUserResponseImpl(0, "hatano", "Hatano@hatano.com", new Date(), new Date());
   }
   @GetMapping("/v1/users")
   public GetUserResponseImpl getUsers() {
      List<UserEntity> userEntityList = UserEntity.referAll();
      return new GetUserResponseImpl(0, "hatano", "Hatano@hatano.com", new Date(), new Date());
   }

}