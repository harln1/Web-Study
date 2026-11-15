package HomeWork.Quize5.GameCharacter01;

public class Wizard extends Character {
    String startLocation;

    //-------------------------------------

    Wizard() {
        super(1000, 120, 300, 5, 50, 12);
        this.startLocation = "마법의 탑";
    }

    //--------------------------------------

    @Override
    void Attack() {
        System.out.println("마법탄 발사! 펑!");
    }

    @Override
    void Introduce() {
        super.Introduce();
        System.out.println("직업: 마법사 | 시작 위치: " + startLocation);
    }

    void Skill() {
        System.out.println("마법사 스킬: 메테오 스트라이크!");
    }
}
