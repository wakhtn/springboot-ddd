package com.hdock.app.domain.entities;

import com.hdock.app.beans.User;
import java.util.List;
import java.util.stream.Collectors;

import com.hdock.app.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.jooq.DSLContext;

public class UserEntity {
   @Autowired
   private static UserRepository userRepository;
   @Autowired
   private static DSLContext dslContext;
   private User user = null;

   public User getUser() {
      return this.user;
   }

   public void setUser(User user) {
      this.user = user;
   }

   public UserEntity(User beanData) {
      this.user = beanData;
   }

   public static List<UserEntity> referAll() {
      return userRepository.findAll().stream().map(user -> {
         return new UserEntity(user);
      }).collect(Collectors.toList());
   }

   public static List<UserEntity> referAllJooq() {
      return null;
      //return dslContext.select().from(M_USER).fetch().into(User.class).stream().map(user -> {
      //   return new UserEntity(user);
      //}).collect(Collectors.toList());
   }

   public void append() {
   }

}