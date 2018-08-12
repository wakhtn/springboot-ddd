package com.hdock.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.stream.Collectors;

import com.hdock.app.beans.User;
import com.hdock.app.domain.entities.UserEntity;
import com.hdock.app.rest.impl.GetUserResponseImpl;
import com.hdock.app.rest.impl.GetUsersResponseImpl;
import com.hdock.app.rest.impl.PostUserRequestImpl;
import com.hdock.app.repository.UserRepository;

@RestController
public class UserController {
   @Autowired
   UserRepository userRepository;

   @GetMapping("/v1/user")
   public GetUserResponseImpl getUser() {
      return new GetUserResponseImpl(0, "hatano", "Hatano@hatano.com", new Date(), new Date());
   }

   @Transactional
   @GetMapping("/v1/users")
   public GetUsersResponseImpl getUsers() {
      return new GetUsersResponseImpl(UserEntity.referAll(userRepository).stream()
            .map(userEntity -> userEntity.getUser()).collect(Collectors.toList()));
   }
   @Transactional
   @PostMapping("/v1/user")
   public String postUser (@RequestBody PostUserRequestImpl request) {
      UserEntity userEntity = new UserEntity();
      userEntity.appendUser(userRepository, new User(request.getMailAddr(),request.getUserName(),request.getPassword()));
      return "OK";
   }

}