package com.hdock.app.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "M_USER")
public class User {
   @Id
   private String id;
   private String mailAddr;
   /**
    * @return the id
    */
   public String getId() {
      return id;
   }

   /**
 * @return the mailAddr
 */
public String getMailAddr() {
	return mailAddr;
}

/**
 * @param mailAddr the mailAddr to set
 */
public void setMailAddr(String mailAddr) {
	this.mailAddr = mailAddr;
}

/**
    * @param id the id to set
    */
   public void setId(String id) {
      this.id = id;
   }
}