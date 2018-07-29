import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {HttpClientModule} from "@angular/common/http";
import {UserService} from "./shared/user.service";
import { UserListComponent } from './user-list/user-list.component';
import {
  MatButtonModule,
  MatCardModule,
  MatIconModule,
  MatInputModule,
  MatListModule,
  MatToolbarModule
} from "@angular/material";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import { UserEditComponent } from './user-edit/user-edit.component';
import {RouterModule, Routes} from "@angular/router";
import {FormsModule} from "@angular/forms";

const appRoutes: Routes = [
  { path: '', redirectTo: '/user-list', pathMatch: 'full'},
  { path: 'user-list',      component: UserListComponent },
  { path: 'user-add',       component: UserEditComponent },
  { path: 'user-edit/:id',  component: UserEditComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    UserEditComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatListModule,
    MatToolbarModule,
    MatIconModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [
    UserService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
