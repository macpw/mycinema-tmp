package com.mycinema.cinema;

import static org.springframework.http.HttpStatus.OK;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycinema.support.Response;

@RestController
@RequestMapping("/ping")
public class PingController {


  @GetMapping("hello")
  public ResponseEntity<Response> ping() {

    return new ResponseEntity<>(new Response("Paweł"), OK);
  }


}
