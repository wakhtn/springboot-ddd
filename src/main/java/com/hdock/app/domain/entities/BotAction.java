package com.hdock.app.domain.entities;

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
}