package chp10.ex10_5;

public class MasterArcher extends Archer {
    @Override
    public void shoot() {
        //super 부모클래스의 기능 쓸때 super키워드 사용
        System.out.println("숙련된 궁수가 활 공격으로 30의 피해를 주었습니다.");
    }
}
