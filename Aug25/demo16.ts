class Student{
    private id: number;
    private name: string;
    private passMark = 40;

    getID(){
        return this.id;
    }

    setId(value){
        if(value < 0)
            throw new Error('id can not be negative')
        this.id = value;
    }
}

let student = new Student();
student.setId(50)

console.log(student.getID())