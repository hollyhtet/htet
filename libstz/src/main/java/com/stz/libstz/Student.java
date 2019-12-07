package com.stz.libstz;

import java.awt.JobAttributes;
import java.util.ArrayList;

public class Student {
    public  String Name;
    public int Age;
    public  String Color;
    public String Sex;


    public static void main (String []args){

        Student Jhon=new Student();
        Jhon.Name="Jhon";
        Jhon.Age=12;
        Jhon.Color="Black";
        Jhon.Sex="Male";
       // System.out.println(Jhon.Name);

        Student Sophia=new Student();
        Sophia.Name="Sophia";
        Sophia.Age=5;
        Sophia.Color="Red";
        Sophia.Sex="Female";
       // System.out.println(Sophia.Name);

        ArrayList<Student>Student=new ArrayList<Student>();
        Student.add(Jhon);
        Student.add(Sophia);

        for (int i=0; i<Student.size(); i++)
        {
            System.out.println("Name "+ Student.get(i).Name);
            System.out.println("Age "+ Student.get(i).Age);
            System.out.println("Color "+ Student.get(i).Color);
            System.out.println("Sex "+ Student.get(i).Sex);
        }
    }
}
