package ex8_4;

import java.util.function.DoubleFunction;

public class Avenger {
    private String name;

    private int healthPower;

    public Avenger(String name, int healthPower) {
        this.name = name;
        this.healthPower = healthPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPower() {
        return healthPower;
    }

    public void setHealthPower(int healthPower) {
        this.healthPower = healthPower;
    }

    public void punch(Avenger enemy) {
        System.out.printf("<%s>의 펀치 날아갔다.", this.name);
        enemy.setHealthPower(enemy.getHealthPower() -10);
        System.out.printf("<%s>의 체력이 <%d> 감소했다.", enemy.getName(), enemy.getHealthPower());
    }

}


