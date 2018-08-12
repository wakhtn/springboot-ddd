package com.hdock.app.domain.services;

import java.util.List;
import java.util.stream.Collectors;

import com.hdock.app.beans.User;
import com.hdock.app.domain.entities.UserEntity;
import com.hdock.app.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
   @Autowired
   UserRepository userRepository;
   public List<User> getAllUsers(){
      return UserEntity.referAll(userRepository).stream().map(entity->{
         return entity.getUser();
      }).collect(Collectors.toList());
   }
}