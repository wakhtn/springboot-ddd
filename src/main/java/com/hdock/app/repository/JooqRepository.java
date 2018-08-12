package com.hdock.app.repository;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * ServiceRepository
 * 
 */
@Repository
public abstract class JooqRepository {
   @Autowired
   public static DSLContext dslContext;

   public void sample() {
   }

}