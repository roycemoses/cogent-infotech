import { Component, OnInit } from '@angular/core';
import { PostService } from './post.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  posts:any = [];
  constructor(private service:PostService)
  {

  }

  // lifecycle function, automatically called by angular framework after the constructor of this Component finishes
  ngOnInit(): void {
    this.service.getPosts()
      .subscribe(response=>{
        this.posts=response;
      });
  }

}
