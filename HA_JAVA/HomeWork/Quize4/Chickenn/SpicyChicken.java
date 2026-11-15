package HomeWork.Quize4.Chickenn;

public class SpicyChicken extends Chicken {

    SpicyChicken(String name) {
        super(name);
    }

    SpicyChicken(String name, int price) {
        super(name, price);
    }

    SpicyChicken(String name, int kcal, int price) {
        super(name, kcal, price);
    }

    @Override
    void EatSound() {
        System.out.println("매콤달달");
        
    }
}
