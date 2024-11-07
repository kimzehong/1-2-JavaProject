package chp10.ex10_9;

public class MainAnimal {
    public static void main(String[] args) {
//        추상클래스는 new 연산자로 객체 생성 불가능
//        Animal animal = new Animal();

        Dog dog = new Dog();
        cat cat = new cat();

        dog.setName("멍멍이");
        dog.eat("밥");;
        dog.cry("jdaaaa");
        dog.sleep(5);
        dog.wag();

        cat.setName("페르시안");
        cat.sleep(7);
        cat.eat("사료");
        cat.cry("냐옹)");
        cat.Growing();
    }
}
