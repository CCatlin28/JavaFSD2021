var Student = /** @class */ (function () {
    function Student() {
        this.passMark = 40;
        // getId(){
        //     return this.id;
        // }
        // setId(value){
        //     if(value < 0)
        //         throw new Error('id can not be negative')
        //     this.id = value;
        // }
    }
    Object.defineProperty(Student.prototype, "x", {
        get: function () {
            return this._x;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "X", {
        set: function (value) {
            if (value < 0)
                throw new Error('error');
            this._x = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "Id", {
        get: function () {
            return this.id;
        },
        set: function (value) {
            if (value < 0) {
                throw new Error('no negative values allowed');
            }
        },
        enumerable: false,
        configurable: true
    });
    return Student;
}());
var student = new Student();
// student.id = 100;
// student.name = 'Mark';
// console.log(`ID: ${student.id}, Name: ${student.name}, passMark: ${student.passMark}`)
student.X = 50;
student.Id = 100;
console.log(student.Id);
