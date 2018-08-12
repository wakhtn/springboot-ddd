package com.hdock.app.domain.entities;

import com.hdock.app.beans.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.hdock.app.repository.UserRepository;

public class UserEntity {
   private User user = null;

   public UserEntity(User user) {
      this.setUser(user);
   }

   /**
    * @return the user
    */
   public User getUser() {
      return user;
   }

   /**
    * @param user the user to set
    */
   public void setUser(User user) {
      this.user = user;
   }

   public static List<UserEntity> referAll(UserRepository userRepository) {
      return userRepository.findAll().stream().map(user -> {
         return new UserEntity(user);
      }).collect(Collectors.toList());
   }
}