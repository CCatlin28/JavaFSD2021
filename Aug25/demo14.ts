class Calculator{
    x: number;
    y: number;

    constructor(x?:number, y?:number){   // the ? allows you to put in that variable or leave it out... all variables to the right of a ? must also have a ?
        this.x=x;
        this.y=y;
    }

   // constructor(){}// can't have two constructors in type script

    addNumber(){
        console.log(this.x + this.y)
    }
}

// let calculator = new Calculator(10,20);   // works only if parameters known
// // calculator.x=10;
// // calculator.y=20;

// calculator.addNumber();

//let calculator = new Calculator(x,y);   // does not work unless var x and y have been set

let calculator = new Calculator();
calculator.x = 100;
calculator.y = 200;
calculator.addNumber();