package com.hdock.app.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_LOG")
public class Log {
   @Id
   private long id;
   private long userId;
   private String message;
   private Date createDate;
   private Date upDate;
}