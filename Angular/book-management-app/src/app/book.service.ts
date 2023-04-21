import { HttpClient } from '@angular/common/http'
import { Book } from './book';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';

@Injectable({
    providedIn:`root`
})
export class BookService
{
    private baseUrl = 'http://localhost:8080/api/books';
    
    constructor (private httpClient:HttpClient) {}

    getBooks():Observable<Book[]> {
        return this.httpClient.get<Book[]>((`${this.baseUrl}`));
    }
}