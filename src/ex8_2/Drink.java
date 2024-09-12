package ex8_2;

public class Drink {

    String name;
    int price;

    Drink(String name , int price){
        this.name = name;
        this.price = price;
    }

    public Drink(){
        System.out.println("기본생성자");
    }
}
