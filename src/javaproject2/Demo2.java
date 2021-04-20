package javaproject2;

class Person {

    int age = 27; //instance variable or global variable
    String name = "Priya";
}

class Demo2 {

    public static void main(String args[]) {
        Person p = new Person(); //Demo is class , d is object
        System.out.println(p.age);
        System.out.println(p.name);
    }
}
