import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {HTTP_INTERCEPTORS, HttpClientModule} from "@angular/common/http";
import {API_URL, ApiInterceptor} from "./configuration/ApiInterceptor";
import {environment} from "../environments/environment";

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule, HttpClientModule
  ],
  providers: [
    {provide: API_URL, useValue: environment.apiUrl},
    {provide: HTTP_INTERCEPTORS, useClass: ApiInterceptor, multi: true, deps: [API_URL]}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
