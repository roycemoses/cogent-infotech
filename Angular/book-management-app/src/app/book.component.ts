import { Component, OnInit } from '@angular/core';
import { Book } from './book';
import { BookService } from './book.service';

@Component({
    selector: 'book',
    templateUrl: './book.component.html',
    styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {
    title = 'book-management-app';

    books:Book[];

    constructor(private bookService:BookService) 
    {
        this.books = [];
    }

    ngOnInit(): void {
        this.bookService.getBooks().subscribe((data:Book[])=>{
            console.log(data);
            this.books = data;
        })
    }
}
