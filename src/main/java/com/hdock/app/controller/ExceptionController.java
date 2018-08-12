
package com.hdock.app.controller;

import com.hdock.app.rest.ErrorResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
   @ExceptionHandler(Exception.class)
   public ResponseEntity<ErrorResponse> finalExceptionHandler(Exception e) {
      e.printStackTrace();
      System.out.println(e.getMessage());
      return new ResponseEntity<ErrorResponse>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
   }
}