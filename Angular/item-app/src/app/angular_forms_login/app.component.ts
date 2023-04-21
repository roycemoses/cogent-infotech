import { Component, OnInit } from '@angular/core';
import { Login } from './login';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  model!:Login;
  loginSuccessful:boolean = false;
  constructor()
  {
    this.model = new Login();
    this.model.username = 'username';
    this.model.password = 'password123';
    this.model.rememberPassword = true;
  }

  onSubmit(loginform:any)
  {
    console.log(loginform.value);
    console.log(loginform.value['username']);
    console.log(loginform.value['password']);
    console.log(loginform.value['rememberPassword']);
    this.loginSuccessful = true;
    alert("Hi " + this.model.username + "!\nPassword: " + this.model.password + "\nRemember password?: " + this.model.rememberPassword);
  }

}
