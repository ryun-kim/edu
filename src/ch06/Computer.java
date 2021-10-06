package ch06;

public class Computer {
    static String brand; //스태틱 멤버필드 :객체가 여러개라도 한개의 값만 저장
    int cpu; //인스턴스 멤버필드 :

    public void print() { //brand와 cpu를 출력하는 값
        System.out.printf("컴퓨터 브랜드는 %s이고, cpu는 %d입니다.", brand, cpu);
    }


/*
    public static void print() {
        System.out.printf("컴퓨터 브랜드는 %s이고, cpu는 %d입니다.", brand, cpu);
    }//스태틱은 스스로 메모리에 올라가고 안붙으면 일일이 메모리에 올려줘야한다.
    //

 */
}
