package chp08.ex8_5;

public class MainStudent {
    public static void main(String[] args) {
        StudentTest s1 = new StudentTest(24010101, "유현주");
        StudentTest s2 = new StudentTest(20240102,  "박현경");
        StudentTest s3 = new StudentTest(20240102,  "박현경");

        System.out.printf("Student 객체의 수: %d",StudentTest.count);
                                    }
}
