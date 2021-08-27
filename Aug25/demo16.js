var Student = /** @class */ (function () {
    function Student() {
        this.passMark = 40;
    }
    Student.prototype.getID = function () {
        return this.id;
    };
    Student.prototype.setId = function (value) {
        if (value < 0)
            throw new Error('id can not be negative');
        this.id = value;
    };
    return Student;
}());
var student = new Student();
student.setId(50);
console.log(student.getID());
