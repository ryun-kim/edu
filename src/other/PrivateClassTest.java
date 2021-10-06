package other;

import ch06.PrivateClass;

public class PrivateClassTest {
    public static void main(String[] args) {
        PrivateClass pc = new PrivateClass();

        //pc.val = 10; private 패키지가 다르기 때문에 접근 불가능
    }
}
