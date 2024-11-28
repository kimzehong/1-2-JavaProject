package chp12.ex12_5;

public class interruptedExceptionTest {

    public void printDelay(){
        String[] arr = {"대한민국", "일본", "스페인", "캐나다", "미국"};
        for (int i = 0; i < 10; i++){
            System.out.println(arr[i]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
}
