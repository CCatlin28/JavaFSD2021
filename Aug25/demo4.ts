let count;  //if type of variable is not declared at variable creation it is of 'any' type
count = 10;
count = true;
count = ' ';

let score = 10;
//score = '';   // can't change type if declared type at time of declaring the variable

let roll: number;
let a: string;
let b: number;
let c: boolean;
let d: any;
let e: any[] = [1, 'A', true, 10.12];
let f: number[] = [1,2,3,4]

let fullName = {
    firstName: '',
    lastName: ''
}

fullName.firstName;


const colorRed = 0;
const colorYello = 1;
const colorBlue = 2;

enum Colors{
    Red,
    Yellow,
    Blue
}

enum Gender {Male, Female}

console.log(Gender.Male);

enum Days {
    Monday = 100,
    Tuesday = 200,
    Wednesday = 300,
    Thursday = 400,
    Friday = 500
}

console.log(Days.Monday)