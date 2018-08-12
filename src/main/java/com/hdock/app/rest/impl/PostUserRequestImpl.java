package com.hdock.app.rest.impl;

import com.hdock.app.rest.Request;

public class PostUserRequestImpl extends Request {
   private String userName;
   private String mailAddr;
   private String password;

   public String getUserName() {
      return this.userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getMailAddr() {
      return this.mailAddr;
   }

   public void setMailAddr(String mailAddr) {
      this.mailAddr = mailAddr;
   }

   public String getPassword() {
      return this.password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

}