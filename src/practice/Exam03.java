package Practice;

import blackjack.Card;

import java.util.ArrayList;

public class Exam03 {
    public static int sum(int n1, int n2){
        return n1+ n2;//스태틱 선언으로 이미 방이 만들어진다.(문서화가 자동으로됨)
    }

    int s1 = 0;
    int s2 = 0;
    //스태틱을 사용하지 않으면 변수선언 먼저 해야 방이 생성된다.(직접 문서화,메모리에 올려준다.)
    public int asd(){
        return s1+ s2;
    }
    //스태틱 멤버필드는 하나의 값만 저장하기 때문에 오버라이딩 된다고 생각하면된다.
    //인스턴스 멤버필드면 하나하나 따로 값이 저장된다.


    public static void main(String[] args) {
        int result = Exam03.sum(20, 30);

        System.out.println(result);
        Exam03 a1 = new Exam03();

        a1.s1 = 4;
        a1.s2 = 3;
        int result2 = a1.asd();
        System.out.println(result2);

        //객체화된 멤버필드에 값넣는 법 2가지
        //1.setter메소드 이용
        //2.생성자를 통해서

        //은닉화된 멤버필드에서 값 빼는 법
        //getter이용

        /*카드 문제 풀이
        //int idx= 0;
        private void init() {
            String[] patters ={"스페이드","하트","클럽","다이아몬드"};
            cards = new ArrayList();
            for(int i=0; i<patters.length; i++){
                for(int z=1; z<=13; z++){
                    String denomination = String.valueOf(z);
                    switch(z) {
                        case 1:
                            denomination = "A"; break;
                        case 11:
                            denomination = "J"; break;
                        case 12:
                            denomination = "Q"; break;
                        case 13:
                            denomination = "k"; break;
                        default:
                            denomination = String.valueOf(z); //2~10은 정수를 문자열로 변경
                            //denomination = z+ "";
                    }
                    Card c =new Card(patters[i], denomination);


        cards[idx++] = new Card();

        card.java확인 잘할것

         */
    }
}
