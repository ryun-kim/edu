package ch06;

public class PrivateClassTest {
    public static void main(String[] args) {
        PrivateClass pc= new PrivateClass();
        pc.defaultVal= 10; //같은 패키지 안에서 가능

        //pc.val =10; class에서 벗어나는 순간 접근할 수 없다.

    }
}
