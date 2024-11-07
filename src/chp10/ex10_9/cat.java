package chp10.ex10_9;

public class cat extends Animal{

    @Override
    public void eat(String food) {
        System.out.println(getName()+"가(이)" + food + "를 먹는다.");
    }

    @Override
    public void cry(String sound) {
        System.out.println(getName() + "가(이 +");
    }

    public void Growing() {
    }
}
