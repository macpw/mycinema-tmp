import {Component} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  user: string;

  constructor(private httpClient: HttpClient) {

    this.httpClient.get<string>("ping/hello")
      .subscribe((value: string) => {
        this.user = value['content'];
      });
  }

}
