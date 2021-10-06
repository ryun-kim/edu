package ch06;

public class PrivateClass {
    private int val;
    int defaultVal; //같은 패키지 안에서는 가능

    public PrivateClass() {}

    private void print() {
        System.out.println("프린트!!!");
    }
}
