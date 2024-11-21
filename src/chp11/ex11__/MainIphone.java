package chp11.ex11__;

public class MainIphone {

    public static void main(String[] args){
        Phone p = new IPhone();
        p.callPhone("010-3333-7777");
        p.receivePhone("02-111-5555");
        System.out.println("제조사명 " + Phone.PRODUCT_NAME);

        IPhone iPhone = new IPhone();
        iPhone.beep();
        iPhone.callPhone("02-777-1111");
        iPhone.playMusic("APT");
        iPhone.sendAirDrop("사진");
        iPhone.sendMessage("오늘 수능 대박나라~");
    }
}
