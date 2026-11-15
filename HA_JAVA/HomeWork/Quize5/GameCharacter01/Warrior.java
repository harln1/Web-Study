package HomeWork.Quize5.GameCharacter01;

public class Warrior extends Character {
    String startLocation;

    Warrior() {
        super(1000, 300, 50, 40, 5, 10);
        this.startLocation = "전사의 협곡";
    }

    //----------------------------------------------------------------

    @Override
    void Attack() {
        System.out.println("대검 베기! 쉭!");
    }

    @Override
    void Introduce() {
        super.Introduce();
        System.out.println("직업: 전사 | 시작 위치: " + startLocation);
    }

    void Skill() {
        System.out.println("전사 스킬: 파워 스트라이크!");
    }
}
