import {Component} from '@angular/core';
import {HttpClient} from "@angular/common/http";

class FilmDto {
  title: string;
  genre: string
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  user: string;
  films: FilmDto[];

  constructor(private httpClient: HttpClient) {

    this.getUser();
    this.getAllFilms();
  }

  private getUser() {
    this.httpClient.get<string>("ping/hello")
      .subscribe((value: string) => {
        this.user = value['content'];
      });
  }

  getAllFilms() {
    this.httpClient.get<FilmDto[]>("ping/films")
      .subscribe(films => this.films = films);
  }

}
