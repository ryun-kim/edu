package ch07;

public class AnimalTest {
    public static void main(String[] args){

        BigCat bigCat =new BigCat();
        Cat cat =new BigCat();
        Animal animal = new BigCat();
        Animal animal2 = new Cat();
        //Animal animal3 = new Animal();
        //Object obj = new Animal();

        //BigCat bc = new Cat(); X
        //Cat cat2 = new Animal(); X

        Cat cat2 = new BigCat();
        cat2.crying();
        //cat2.sleep(); 받은게 없기 떄문에 호출할 수 없다.

        BigCat bigCat1 = (BigCat)cat2;
        bigCat1.sleep();

    }
}
