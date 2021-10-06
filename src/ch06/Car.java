package ch06;

public class Car {
    /*
        2가지로 구성
        - 멤버 필드 (변수, 상수)
        - 메소드
     */
    String nm;  //멤버필드
    String brand;

    //기본 생성자
    //1. 클래스명과 같다.
    //2. 리턴 타입이 없어야 한다.
    // * 생성자가 하나도 없으면 컴파일러가 자동으로 넣어준다.

    //오버로딩 : 똑같은 이름의 메소드를 여러개 만들 수 있는 기술
    //          파라미터만 다르다면 다르게 만들 수 있다.
    //          타입만 중요, 타입의 갯수,순서, 리턴타입은 상관없음!
    Car() {}

    Car(String brand,String nm){ //지역변수, 전역변수
        this.brand =brand;
        this.nm = nm;
    }

    public void drive() {
        System.out.printf("%s의 %s가 달린다.\n", brand,nm);
    }

    public void stop() {
        System.out.printf("%s의 %s가 멈춘다.\n", brand,nm);
    }

}
