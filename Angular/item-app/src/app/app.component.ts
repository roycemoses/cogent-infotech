import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  inHome:boolean=true;

  toggleHome() 
  { 
    this.inHome = !this.inHome; 
  }

}
