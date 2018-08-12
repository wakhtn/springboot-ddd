package com.hdock.app.rest;


public abstract class Response {
   private boolean status = true;
   private String errorInfo = "operation success";

   /**
    * @return the status
    */
   public boolean isStatus() {
      return status;
   }

   /**
    * @return the errorInfo
    */
   public String getErrorInfo() {
      return errorInfo;
   }

   /**
    * @param errorInfo the errorInfo to set
    */
   public void setErrorInfo(String errorInfo) {
      this.errorInfo = errorInfo;
   }

   /**
    * @param status the status to set
    */
   public void setStatus(boolean status) {
      this.status = status;
   }

}