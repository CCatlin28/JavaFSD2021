class Book{

    constructor(
        public title: string,
        public author: string,
        public price: number,){
    }

    public getBookInfo(){
        console.log(`Book: Title=${this.title}, Author=${this.author}, Price=$${this.price}`)
    }
}


let book1 = new Book('Sandrys Book','Tamora Pierce',20);
 let book2 = new Book('Eye Spy', 'Mercedes Lackey', 25);

 book1.getBookInfo();
 book2.getBookInfo();