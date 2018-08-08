package com.hdock.app.domain.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "M_USER")
public class User {
  @Id
  private long id;
  private String mailAddr;
  private String userName;

  /**
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
 * @return the userName
 */
public String getUserName() {
	return userName;
}

/**
 * @param userName the userName to set
 */
public void setUserName(String userName) {
	this.userName = userName;
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
  public void setId(long id) {
    this.id = id;
  }
}