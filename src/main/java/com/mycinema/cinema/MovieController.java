package com.mycinema.cinema;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
class MovieController {

  private final MovieRepository movieRepository;

  public MovieController(MovieRepository movieRepository) {
    this.movieRepository = movieRepository;
  }

  @GetMapping("/all")
  public List<Movie> getMovie() {
    return movieRepository.findAll();
  }

  @PostMapping
  public ResponseEntity saveMovie(@RequestBody MovieDto movie) {
    return new ResponseEntity(HttpStatus.OK);
  }


}
