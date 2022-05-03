package by.kursy.buyel.javalessons.lesson16.model.entity;

public class Student {
    public String name;
    public int age;
    public double mark;
    public char sex;
    public boolean alive;

    //default constructor
    public Student(){

    }

    public Student(String n, int a, double m, char s, boolean al){
        name = n;
        age = a;
        mark = m;
        sex = s;
        alive = al;
    }
    public Student(String n){
        name = n;

    }
    public Student(String n, int a, char s, boolean al){
        name = n;
        age = a;
        sex = s;
        alive = al;
    }

    public String getInfo(){
        return name + " { age = " + age + "; mark = " + mark + "; sex " + (sex == 'm'? "male" : "female") + "; alive = " + (alive ? "yes" : "no") + " }";
    }

    }
