function hello(name) {
    console.log('Aloha ' + name);
}
hello('Rena');
var result = function (name) { return 'Bonjour ' + name; }; // this one line is the same as all above
console.log(result('Aiden'));
//old syntax
function addNumber(a, b) {
    return a + b;
}
var sum = addNumber(20, 30);
console.log(sum);
//new syntax
var sum2 = function (a, b) { return a + b; };
console.log(sum2(50, 40));
var employee = {
    firstName: 'Mark',
    lastName: 'Smith'
};
console.log(employee.firstName); //mark
employee.firstName = 'Paul';
console.log(employee.firstName);
var sub = function (a, b) { return a - b; };
var mul = function (a, b) {
};
var sayHello = function (name) { return 'Aloha ' + MediaKeyMessageEvent; };
var sayHello2 = function () { return ''; };
