package ch05;

public class ArrayExample {
    public static void main(String[] args) {
        //배열(Array)
        
        /*
        같은 타입의 값을 여러개 저장할때 좋다
        for문과 함께 사용해도 좋다
         */

        int[] scores = {83, 90, 87, 100, 88, 50} ; //int형 배열
        //scores[0] =11;
        //System.out.println(scores[0]);

        System.out.println(scores.length);

        for(int i=0; i<scores.length; i++){
            System.out.println(scores[i]);
        }


    }
}
