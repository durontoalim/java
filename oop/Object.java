public class Object{
    public static void main(String[] args){
       Person p1 = new Person();
       p1.name = "Hello";
       p1.age = 35;

       p1.walk();
       p1.eat();
    }
}


class Person{
    String name; int age;
    void walk(){
        System.out.println(name);
    }
    void eat(){
        System.out.println(age);
    }
}