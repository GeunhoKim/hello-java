package com.geunho.hello.service.rapidoid;

import org.rapidoid.annotation.Valid;
import org.rapidoid.net.Server;
import org.rapidoid.setup.App;
import org.rapidoid.setup.On;
import org.rapidoid.jpa.JPA;


public class Main {
  public static void main(String[] args) throws Exception {
//    Server server = new HelloHttpServer().listen(8080);

    App.bootstrap(args).jpa();
    On.get("/size").json((String msg) -> msg.length());
    On.get("/hello").json(() -> JPA.of(Message.class).all());
    On.post("/hello").json((@Valid Message m) -> JPA.save(m));

  }
}
