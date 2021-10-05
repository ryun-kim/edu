package other;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox bn1 = new NumberBox(1);
        NumberBox bn2 = new NumberBox(1);

        System.out.println(bn1 == bn2);
        System.out.println(bn1.equals(bn2));
        System.out.println(bn1.getVal());
        System.out.println(bn2.getVal());

        System.out.println("bn1:" + bn1);
        System.out.println(bn1.toString());
        System.out.println("bn2:" + bn2);
        System.out.println(bn2.toString()); //오버라이딩되있기 때문에 해쉬코드가 뜨는것

        String str =new String("abc");
        System.out.println(str);
        System.out.println(str.toString());


    }
}
