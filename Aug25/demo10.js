var Book = /** @class */ (function () {
    function Book() {
    }
    Book.prototype.getBookInfo = function () {
        console.log("Book: Title=" + this.title + ", Author=" + this.author + ", Price=$" + this.price);
    };
    return Book;
}());
var book1 = new Book();
book1.title = 'Sandrys Book';
book1.author = 'Tamora Pierce';
book1.price = 20;
//console.log('Book: Title='+book1.title+', Author='+book1.author+', Price=$'+book1.price);
var book2 = new Book();
book2.title = 'Eye Spy';
book2.author = 'Mercedes Lackey';
book2.price = 25;
//console.log('Book: Title='+book2.title+', Author='+book2.author+', Price=$'+book2.price);
book1.getBookInfo();
book2.getBookInfo();
