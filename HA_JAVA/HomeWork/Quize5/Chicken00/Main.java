package HomeWork.Quize5.Chicken00;

public class Main {
    public static void main(String[] args) {
        Chicken ch = new Chicken("후라이드", 1500, 18000);
        SpicyChicken spicy = new SpicyChicken("양념치킨", 19000);
        SoyChicken soy = new SoyChicken("간장치킨", 1800, 20000);

        ch.EatSound();    
        spicy.EatSound(); 
        soy.EatSound();  

    }
    
}
