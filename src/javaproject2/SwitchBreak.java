package javaproject2;

public class SwitchBreak {

    public static void main(String[] args) {
        int i = 5;
        switch (i) {
            case 5:
                System.out.println("Value is 5");
                break;
            case 10:
                System.out.println("Value is 10");
                break;
            case 15:
                System.out.println("Value is 15");
                break;
            default:
                System.out.println("No value match");
        }
    }
}
