package by.kursy.buyel.javalessons.lesson17.model;

public class Student {
    private String name;

    public Student(){
        name =  "no name";
    }

    public Student(String name){
        this.name = name;
    }

    public Student(Student student){
        //this.name = student.name;
        this(student.name);
    }

    public void change(){
        name = "Alex";
    }
}
