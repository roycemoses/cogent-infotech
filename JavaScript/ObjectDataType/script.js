function Book()
{
    this.name = "abc";
    this.author = "xyz";
    this.publisher = "123";
    this.display = function() { 
        document.write("Hi! I'm in the Book's display function. <br>"); 
    } 
}

// Object
var book = new Book();
// document.write("typeof book: " + typeof book + "<br>");
Book.prototype.year = 2001;
// book.year = 2002;
book.display();
document.write("book.name: " + book.name + "<br>")
document.write("book.author: " + book.author + "<br>")
document.write("book.publisher: " + book.publisher + "<br>")
document.write("book.year: " + book.year + "<br>")

Book.prototype.showAllDetails = function () {
    document.write("hey! showing all details...");
    
}

book.showAllDetails();