class Student{
    private id: number;
    private name: string;
    private passMark = 40;
    private _x;

    get x(){
        return this._x;
    }

    set X(value){
        if(value<0)
            throw new Error('error')
        this._x=value;
    }
    get Id(){
        return this.id;
    }

    set Id(value){
        if(value<0){
            throw new Error('no negative values allowed')
        }
    }

        // getId(){
    //     return this.id;
    // }

    // setId(value){
    //     if(value < 0)
    //         throw new Error('id can not be negative')
    //     this.id = value;
    // }
}

let student = new Student();
// student.id = 100;
// student.name = 'Mark';

// console.log(`ID: ${student.id}, Name: ${student.name}, passMark: ${student.passMark}`)

student.X= 50;
student.Id=100;
console.log(student.Id)