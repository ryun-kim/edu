package ch07;

public class AnimalTest2 {
    public static void main(String[] args) {
        BigCat bc = new BigCat();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        Animal animalCrying = new animalCrying();

        animalCrying();
        animalCrying(bc); //큰 고양이 냐~~~옹
        animalCrying(cat); //고양이 야옹야옹
        animalCrying(dog); //강아지 멍멍
        animalCrying(cow); //소가 음머~~
        //객체화 하지않음 == static 메서드

    }
    public  void animalCrying(Animal ani){ ani.crying(); }
}
