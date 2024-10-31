package chp10.ex10_5;

public class MainArcher {
    public static void main(String[] args) {
        Archer archer1 = new Archer();
        MasterArcher ma = new MasterArcher();
        Archer archer2 = new MasterArcher();
        Archer archer3 = (Archer) new MasterArcher();

        archer1.shoot(); //Archer의 슛
        ma.shoot(); //숙련된 아처의 슛이 호출됨.
        archer2.shoot(); //숙련된 아처의 슛!
        archer3.shoot(); //숙련된 아처의 슛!
    }
}
