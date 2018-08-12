package com.hdock.app.rest;

public class ErrorResponse extends Response {
   private String errorMessage;

   public ErrorResponse(String errorMessage) {
      this.errorMessage = errorMessage;
   }

/**
 * @return the errorMessage
 */
public String getErrorMessage() {
	return errorMessage;
}

/**
 * @param errorMessage the errorMessage to set
 */
public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
}
}