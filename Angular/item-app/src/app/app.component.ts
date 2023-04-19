import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  products = [] as any;
  title = "product";

  // lifecycle function, automatically called by angular framework after the constructor of this Component finishes
  ngOnInit(): void {
    this.products = this.getProduct();
  }

  getProduct()
  {
    return [
      {'id':'1','title':'Screwdriver','price':400,'stock':100},
      {'id':'2','title':'Hammer','price':1100,'stock':50},
      {'id':'3','title':'Axe','price':700,'stock':25}
    ]
  }

}
