package com.weescoelho.products_api.services.exceptions;

public class DatabaseException extends RuntimeException {
  public DatabaseException(String msg) {
    super(msg);
  }
}
