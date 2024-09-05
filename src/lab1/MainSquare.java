package lab1;

public class MainSquare {
    public static void main(String[] args) {

        Square s1 = new Square();
        //객체 생성
        s1.setLength(4);
        int result1 = s1.area();

        Square s2 = new Square();
        s2.setLength(7);
        int result2 = s2.area();

        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이 :  %d", s1.getLength(), result1 );
        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이 :  %d", s2.getLength(), result2 );

    }
}
