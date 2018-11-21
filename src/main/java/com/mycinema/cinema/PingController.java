package com.mycinema.cinema;

import static org.springframework.http.HttpStatus.OK;

import java.util.ArrayList;
import java.util.List;

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



  @GetMapping("films")
  public List<FilmDto> getAllFilms() {

    ArrayList<FilmDto> films = new ArrayList<>();
    films.add(new FilmDto("HArry potter", "fantasy"));
    films.add(new FilmDto("GRavity", "science fiction"));
    films.add(new FilmDto("Interstellar", "science fiction"));
    films.add(new FilmDto("wladca pierscini", "fantasy"));


    return films;
  }

}
