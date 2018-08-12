package com.hdock.app.rest.impl;

import java.util.Date;
import com.hdock.app.beans.User;
import com.hdock.app.rest.ErrorResponse;

public class GetUserResponseImpl extends ErrorResponse{
  private long id;
  private String userName;
  private String mailAddr;
  private Date createDate;
  private Date upDate;

  public GetUserResponseImpl(long id, String userName, String mailAddr, Date insDate, Date upDate) {
    this.id = id;
    this.userName = userName;
    this.mailAddr = mailAddr;
    this.createDate = insDate;
    this.upDate = upDate;
  }

  public GetUserResponseImpl(User user) {
    this.id = user.getId();
    this.userName = user.getUserName();
    this.mailAddr = user.getMailAddr();
    this.createDate = user.getCreateDate();
    this.upDate = user.getUpDate();
  }


  /**
   * @return the id
   */
  public long getId() {
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
   * @return the insDate
   */
  public Date getInsDate() {
    return createDate;
  }

  /**
   * @param insDate the insDate to set
   */
  public void setInsDate(Date insDate) {
    this.createDate = insDate;
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
   * @param id the id to set
   */
  public void setId(long id) {
    this.id = id;
  }
}