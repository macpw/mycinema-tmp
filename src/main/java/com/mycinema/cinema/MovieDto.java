package com.mycinema.cinema;

import java.io.Serializable;

public class MovieDto implements Serializable {

  private String title;
  private int time;
  private long genreId;

  public MovieDto(String title, int time, long genreId) {
    this.title = title;
    this.time = time;
    this.genreId = genreId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getTime() {
    return time;
  }

  public void setTime(int time) {
    this.time = time;
  }

  public long getGenreId() {
    return genreId;
  }

  public void setGenreId(long genreId) {
    this.genreId = genreId;
  }
}
