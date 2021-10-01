package ch05;

public class ArrayTest {
    public static void main(String[] args) {
        int[] scores = {100, 87, 56, 23, 28, 98, 30, 32};

        //점수가 짝수인 친구들만 점수 프린트 해주시고
        //점수가 홀수인 친구들의 합계점수도 프린트 해주세요.
        int oddSum = 0;
        for(int i=0; i<scores.length; i++){
            if(scores[i] % 2 == 0){//짝수
                System.out.printf("score[%d] : %d\n",i,scores[i]);
            }else{
                oddSum += scores[i];

            }
        }
        System.out.println("홀수 합계 :" + oddSum);

        /*
        int num = 0;
        int hol = 0;
        int jak = 0;
        for(int i=0; i<scores.length; i++){
            num = scores[i] / 2;
            if(num ==1 ){
                System.out.println(hol);

            }

            System.out.println("홀수의 합계 : " + jak);
        }

         */
    }
}
