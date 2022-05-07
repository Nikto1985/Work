package by.kursy.buyel.javalessons.lesson16.model.entity;

import javax.swing.text.html.parser.TagElement;
import javax.xml.namespace.QName;

public class Student {
    public String name;
    public int age = getAge();
    public double mark;
    public char sex;
    public boolean alive;

    
    private  int getAge(){
        System.out.println("init field");
        return 0;
    }
    //default constructor
  public Student(){
        name = "no name";
        age = 16;
        mark = 4;
        alive = true;
        sex = 'f';

    }

    public Student(String name, int age, double mark, char sex, boolean alive){
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.sex = sex;
        this.alive = alive;

    }
    public Student(String name){
        this.name = name;

    }
    public Student(String name, int age, char sex, boolean alive){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.alive = alive;
    }

    public Student(Student student){
        name = student.name;
        age = student.age;
        mark = student.mark;
        sex = student.sex;
        alive = student.alive
    }

    {
        mark = 4;
    }



    public String getInfo(){
        return name + " { age = " + age + "; mark = " + mark + "; sex " + (sex == 'm'? "male" : "female") + "; alive = " + (alive ? "yes" : "no") + " }";
    }
    public void testing(){
        System.out.println(this.hashCode());
    }

    }
