package com.geunho.hello.service.rapidoid;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Message {

  @NotNull
  @Id
  public int id;

  @NotNull
  public String message;

}