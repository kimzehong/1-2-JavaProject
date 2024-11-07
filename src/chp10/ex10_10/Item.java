package chp10.ex10_10;

public class Item {
    private String name;
    private int price;
    private int power;

//    필드명과 지역변수(매개변수)의 이름이 같은 경우 구별하는 용도로 this 키워도 사용

    public Item(String name){
        this.name = name;
    }

    public Item(String name, int price) {
        this(name);
        this.price = price;
    }

    public Item(String name, int price, int power) {
        this(name, price);
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}




