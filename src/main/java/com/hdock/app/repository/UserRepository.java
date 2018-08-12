package com.hdock.app.repository;
import java.util.List;
import java.util.Optional;

import com.hdock.app.beans.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
   public Optional<List<User>> findByUserName(String name);
   public Optional<List<User>> findByMailAddr(String mailAddr);
}