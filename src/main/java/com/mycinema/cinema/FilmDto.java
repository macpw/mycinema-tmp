package com.mycinema.cinema;

import java.io.Serializable;

public class FilmDto implements Serializable {

  private static final long serialVersionUID = 4197626055524667272L;
  private String title;

  public FilmDto(String title, String genre) {
    this.title = title;
    this.genre = genre;
  }

  private String genre;

  public String getTitle() {
    return title;
  }

  public String getGenre() {
    return genre;
  }
}