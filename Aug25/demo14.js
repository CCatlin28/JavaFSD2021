var Calculator = /** @class */ (function () {
    function Calculator(x, y) {
        this.x = x;
        this.y = y;
    }
    // constructor(){}// can't have two constructors in type script
    Calculator.prototype.addNumber = function () {
        console.log(this.x + this.y);
    };
    return Calculator;
}());
// let calculator = new Calculator(10,20);   // works only if parameters known
// // calculator.x=10;
// // calculator.y=20;
// calculator.addNumber();
//let calculator = new Calculator(x,y);   // does not work unless var x and y have been set
var calculator = new Calculator();
calculator.x = 100;
calculator.y = 200;
calculator.addNumber();
