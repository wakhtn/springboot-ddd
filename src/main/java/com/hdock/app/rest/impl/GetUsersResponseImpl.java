package com.hdock.app.rest.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.hdock.app.beans.User;
import com.hdock.app.domain.entities.UserEntity;
import com.hdock.app.rest.Response;


public class GetUsersResponseImpl extends Response{
  private List<GetUserResponseImpl> userList;

  public GetUsersResponseImpl(List<User> users) {
    this.setUserList(users.stream().map(user->{
      return new GetUserResponseImpl(user);
    }).collect(Collectors.toList()));
  }

/**
 * @return the userList
 */
public List<GetUserResponseImpl> getUserList() {
	return userList;
}

/**
 * @param userList the userList to set
 */
public void setUserList(List<GetUserResponseImpl> userList) {
	this.userList = userList;
}

}