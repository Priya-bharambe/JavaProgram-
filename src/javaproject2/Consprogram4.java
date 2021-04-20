package javaproject2;

class Person2 {

    Person2() {
        System.out.println("This is default constructor of Persn class");
    }

    Person2(int age, String name) {
        System.out.println("Your age is " + age + " and Your name is " + name);
    }
}

class Demo {

    public static void main(String args[]) {
        Person2 p = new Person2();
        Person2 p1 = new Person2(30, "Tushar");
    }
}
