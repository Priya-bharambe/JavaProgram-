package javaproject2;

class Person1 {

    Person1(int age, String name) {
        System.out.println("Your age is " + age + " and Your name is " + name);
    }
}

public class ConsProgram3 {

    public static void main(String args[]) {
        Person1 p = new Person1(27, "Priya");
    }

}
