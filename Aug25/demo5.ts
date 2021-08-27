function hello(name){
    console.log('Aloha '+ name);
}

hello('Rena');

const result = (name) => 'Bonjour '+name;  // this one line is the same as all above

console.log(result('Aiden'))

//old syntax
function addNumber(a, b){
    return a + b;
}

const sum = addNumber(20,30)
console.log(sum)

//new syntax
const sum2 = (a, b) => a+b;
console.log(sum2(50,40));


const employee = {
    firstName: 'Mark',
    lastName: 'Smith'
}

console.log(employee.firstName);  //mark

employee.firstName= 'Paul';
console.log(employee.firstName);

const sub = (a,b)=>a-b;
const mul = (a, b)=>{

}

const sayHello = name => 'Aloha ' + MediaKeyMessageEvent;
const sayHello2 = () =>''