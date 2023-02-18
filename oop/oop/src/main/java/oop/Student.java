package oop;

public class Student{
    String name, id;
    int number;
    
    Student(String s, String s2, int n){
        name = s;
        id = s2;
        number = n;
    }
    static int count = 0;
    Student(){
        count++;
    }
    
    
    void displayInfo(){
        System.out.println("Name : "+ name);
        System.out.println("Id : "+ id);
        System.out.println("Number : "+ number);
    }
}