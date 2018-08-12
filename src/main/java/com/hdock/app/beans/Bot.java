package com.hdock.app.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "M_BOT")
public class Bot {
   @Id
   private long id;
   private long userId;
   private String botProvider;
   private String botName;
   private Date createDate;
   private Date upDate;

   public static Bot referByBotUser() {
      return new Bot();
   }

   /**
    * @return the userId
    */
   public long getUserId() {
      return userId;
   }

   /**
    * @return the botProvider
    */
   public String getBotProvider() {
      return botProvider;
   }

   /**
    * @param botProvider the botProvider to set
    */
   public void setBotProvider(String botProvider) {
      this.botProvider = botProvider;
   }

   /**
    * @return the upDate
    */
   public Date getUpDate() {
      return upDate;
   }

   /**
    * @param upDate the upDate to set
    */
   public void setUpDate(Date upDate) {
      this.upDate = upDate;
   }

   /**
    * @return the createDate
    */
   public Date getCreateDate() {
      return createDate;
   }

   /**
    * @param createDate the createDate to set
    */
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   /**
    * @return the botName
    */
   public String getBotName() {
      return botName;
   }

   /**
    * @param botName the botName to set
    */
   public void setBotName(String botName) {
      this.botName = botName;
   }

   /**
    * @param userId the userId to set
    */
   public void setUserId(long userId) {
      this.userId = userId;
   }

}