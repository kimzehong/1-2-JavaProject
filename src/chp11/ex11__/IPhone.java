package chp11.ex11__;

public class IPhone implements Phone, Alarm, Message {

    @Override
    public void playMusic(String musicTitle) {
        System.out.println(musicTitle + "음악을" + PRODUCT_NAME + "Music으로 재생합니다.");
    }

    @Override
    public void beep() {
        System.out.println("beep음이 삐삐삐삐삐 발생합니다.");
    }

    @Override
    public void sendMessage(String content) {
        System.out.println(content + "메세지를 전송합니다.");
    }

    @Override
    public void receiveMessage(String content) {
        System.out.println(content + "메세지를 받습니다.");
    }

    @Override
    public void callPhone(String phoneNumber) {
        System.out.println(phoneNumber + "로 전화를 겁니다.");
    }

    @Override
    public void receivePhone(String phoneNumber) {
        System.out.println(phoneNumber + "의 전화를 받습니다.");
    }
    public void sendAirDrop(String content) {
        System.out.println("에어드롭으로" + content + "를(을) 보냅니다.");
    }
}
