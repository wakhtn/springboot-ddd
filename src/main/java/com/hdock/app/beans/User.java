package com.hdock.app.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "M_USER", indexes = @Index(name = "index1", columnList = "mailAddr,userName"))
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }
  @Column(length = 50)
  private String mailAddr;
  @Column(length = 35)
  private String userName;
  @Column(length = 20)
  private String password;
  private Date createDate;
  private Date upDate;

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Date getCreateDate() {
    return this.createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public Date getUpDate() {
    return this.upDate;
  }

  public void setUpDate(Date upDate) {
    this.upDate = upDate;
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