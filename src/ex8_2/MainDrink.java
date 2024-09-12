package ex8_2;

public class MainDrink {
    public static void main(String[] args) {

        Drink d1 = new Drink();
        Drink coke = new Drink("콜라", 2000);
        Drink cider = new Drink("사이다", 2000);

        System.out.println(d1);
        System.out.println(coke);
        System.out.println(cider);
    }

}
