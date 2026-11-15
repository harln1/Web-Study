package HomeWork.Quize5.GameCharacter01;

public class Healer extends Character {
    String startLocation;

    //------------------------------------------

    Healer() {
        super(1000, 150, 250, 10, 35, 15);
        this.startLocation = "신성한 사원";
    }

    //------------------------------------------

    @Override
    void Attack() {
        System.out.println("지팡이 타격! 톡!");
    }

    @Override
    void Introduce() {
        super.Introduce();
        System.out.println("직업: 힐러 | 시작 위치: " + startLocation);
    }

    void Skill() {
        System.out.println("그레이트 힐~");
    }
}
