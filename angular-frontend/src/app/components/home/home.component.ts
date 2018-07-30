import { Component, OnInit } from '@angular/core';
import {AppService} from "../../services/app.service";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  title = 'Home';
  greeting = 'Hello there!';

  constructor(private app: AppService,
              private http: HttpClient) {  }

  ngOnInit() {
  }

  authenticated() {
    return this.app.authenticated;
  }

}
