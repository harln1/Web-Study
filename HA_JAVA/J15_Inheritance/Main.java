package J15_Inheritance;

public class Main {
    public static void main(String[] args) {
        Dog hot = new Dog("미니",12);
        Cat nip = new Cat("서연", 5);
        Squirrel rat = new Squirrel("솔지", 3);

        hot.Eat();
        hot.Sleep();
        hot.Hunt();
        hot.PowerStrike();

        nip.Eat();
        nip.Sleep();
        nip.Hunt();
        nip.StealthAttack();
        // ===================================================
    }
}
