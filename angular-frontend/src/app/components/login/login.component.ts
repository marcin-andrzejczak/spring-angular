import { Component, OnInit } from '@angular/core';
import {AppService} from "../../services/app.service";
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";
import {NgForm} from "@angular/forms";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  credentials: any = {};

  constructor(private app: AppService,
              private http: HttpClient,
              private router: Router) { }

  ngOnInit() {
  }

  login(form: NgForm){
    this.app.authenticate(form, () => {
      this.router.navigateByUrl("/");
    });
  }

}
