package ch04;

public class SwitchTest2 {
    public static void main(String[] args){
        String position = new String("과장");

        switch(position){
            case "과장":
                System.out.println("700만원");
            case "부장":
                System.out.println("500만원");
            default :
                System.out.println("300만원");
        }
    }
}
