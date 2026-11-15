package HomeWork.Quize5.GameCharacter01;

public class Archor extends Character {
    String startLocation;

    //---------------------------------------

    Archor() {
        super(1000, 180, 100, 30, 10, 25);
        this.startLocation = "엘프의 숲";
    }

    //---------------------------------------

    @Override
    void Attack() {
        System.out.println("화살 발사! 피융!");
    }

    @Override
    void Introduce() {
        super.Introduce();
        System.out.println("직업: 궁수 | 시작 위치: " + startLocation);
    }

    void Skill() {
        System.out.println("궁수 스킬: 애로우 레인!");
    }
}
