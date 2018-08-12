package com.hdock.app.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "M_BOT_ACTION")
public class BotAction {
   @Id
   private long Id;
   private long botId;
   private long userId;
   private Date createDate;
   private Date upDate;
}