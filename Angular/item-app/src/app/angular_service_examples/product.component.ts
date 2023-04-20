import { Component, OnInit } from '@angular/core';
import { ProductService } from './product.service';

@Component({
  selector: 'product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  products = [] as any;
  title = "product";
  showMessage = true;
  companyName = "Royce's Company";
  mainProductName = "T-Shirt";
  mainProductPrice = "19.91";

  data:any;
  constructor(private service:ProductService)
  {
    
  }

  // lifecycle function, automatically called by angular framework after the constructor of this Component finishes
  ngOnInit(): void {
    this.products = this.service.getData();
    console.log(this.products);
  }

  checkPrice(price:number)
  {
    if (price > 100)
        return true;
    else
        return false;
  }

}
