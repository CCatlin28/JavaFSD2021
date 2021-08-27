class Book{
    public title: string;
    public author: string;
    public price: number;

    constructor(title: string, author: string, price: number){
        this.title = title;
        this.author = author;
        this.price = price;

    }

    public getBookInfo(){
        console.log(`Book: Title=${this.title}, Author=${this.author}, Price=$${this.price}`)
    }
}


let book1 = new Book('Sandrys Book','Tamora Pierce',20);
 let book2 = new Book('Eye Spy', 'Mercedes Lackey', 25);

 book1.getBookInfo();
 book2.getBookInfo();