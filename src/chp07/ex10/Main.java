package chp07.ex10;

public class Main {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        b1.name = "로드형 자전거";
        b1.weight = 7.25;
        b1.price = 326000;
        System.out.printf("b1 => {%s, %.2f, %d", b1.name, b1.weight, b1.price);
    }
}
