package HomeWork.Quize4.Chickenn;

public class Chicken {
    //----------------------------------------
    String name;
    int kcal;
    int price;

    //----------------------------------------
    Chicken(String name) {
        this(name, 0, 0);
    }

    
    Chicken(String name, int price) {
        this(name, 0, price);
    }

    
    Chicken(String name, int kcal, int price) {
        this.name = name;
        this.kcal = kcal;
        this.price = price;
    }

    //----------------------------------------

    void EatSound() {
        System.out.println("바삭바삭");
    }
}
