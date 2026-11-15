package HomeWork.Quize5.Chicken00;

public class SoyChicken extends Chicken {

    SoyChicken(String name) {
        super(name);
    }

    SoyChicken(String name, int price) {
        super(name, price);
    }

    SoyChicken(String name, int kcal, int price) {
        super(name, kcal, price);
    }

    //---------------------------------------------
    @Override
    void EatSound() {
        System.out.println("Sweet & Salty");
    }
}
