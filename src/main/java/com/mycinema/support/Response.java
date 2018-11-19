package com.mycinema.support;

import java.io.Serializable;

public class Response implements Serializable {

  private static final long serialVersionUID = 6253740669834323121L;
  private Object content;

  public Response(Object content) {
    this.content = content;
  }

  public Object getContent() {
    return content;
  }
}
