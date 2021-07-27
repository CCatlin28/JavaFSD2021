package com.christycatlin.day2;

class Student2{
//    public int id;
//    public String name;
//    public int passMark = 40;
    // redo as private
    private int id;
    private String name;
    private int passMark = 40;

    public int getId() {
        return id;
    }
    public void setId(int id) throws Exception{
        if(id<0)
            throw new Exception("ID cannot be a negative value");
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) throws Exception{
        if(name.isEmpty())
            throw new Exception("name cannot be blank");
        this.name = name;
    }
    public int getPassMark(){
        return passMark;
    }
}
public class Demo28 {
    public static void main(String[] args) throws Exception{

// id should be >0, name should not be null, passMark should not be able to be modified
        Student2 student = new Student2();
//        student.id = -1;
//        student.name = null;
//        student.passMark =20;
// these would all be valid if left as public variables
//        System.out.println("Id = "+ student.id+ " Name = "+ student.name + " Pass Mark = "+student.passMark);

    student.setId(1);
    student.setName("");
        System.out.println("Id = "+ student.getId()+ ", Name = "+ student.getName()+", Passmark = "+ student.getPassMark());
   }
}
