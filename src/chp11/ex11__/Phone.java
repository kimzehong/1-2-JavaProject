package chp11.ex11__;

public interface Phone {
//    인터페이스는 상수, 추상메소드, default 메소드, static메소드 등을 사용할 수 있습니다.
//    상수는 final, static을 생량 가능
    String PRODUCT_NAME = "Apple";
    public abstract void callPhone(String phoneNumber);

//    추상메소드는 public abstract를 생략 가능
    void receivePhone(String phoneNumber);
}
