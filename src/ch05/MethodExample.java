package ch05;

public class MethodExample {


    public static void main(String[] args) {
        sum(10, 20);
        sum(50, 120);
        minus(10, 2);
        minus(100, 50);
    }

    public static void sum(int n1, int n2){
        System.out.println("sum : " + (n1 + n2));
    }

    public static void minus(int n1, int n2){
        System.out.println("minus : " + (n1 - n2));
    }
}
