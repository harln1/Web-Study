package HomeWork.Quize5.GameCharacter01;

public class Main {
    public static void main(String[] args) {
        Warrior w = new Warrior();
        w.Introduce();
        w.Attack();
        w.Skill();

        System.out.println("--------------------");

        Healer h = new Healer();
        h.Introduce();
        h.Attack();
        h.Skill();

        Character.scanner.close(); 
    }
}
