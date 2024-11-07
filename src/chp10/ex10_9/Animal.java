package chp10.ex10_9;

//추상클래스
//자식클래스를 표준화(특정기능을 반드시 갖도록 하기 위해서


abstract public class Animal {

    private String name;

    public abstract void eat(String food);

    public abstract void cry(String sound);

    public void sleep(int hours){
        System.out.println( hours + "시간 동안 자다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
