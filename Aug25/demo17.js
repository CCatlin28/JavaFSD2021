"use strict";
exports.__esModule = true;
exports.B = exports.A = void 0;
var User = /** @class */ (function () {
    function User(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    User.prototype.getFullName = function () {
        console.log(this.firstName + " " + this.lastName);
    };
    return User;
}());
exports["default"] = User;
var A = /** @class */ (function () {
    function A() {
    }
    return A;
}());
exports.A = A;
var B = /** @class */ (function () {
    function B() {
    }
    return B;
}());
exports.B = B;
var C = /** @class */ (function () {
    function C() {
    }
    return C;
}());
