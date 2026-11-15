package HomeWork.Quize1;
public class Main{
    public static void main(String[] args) {

        //Pizza

        Pizza Peperoni = new  Pizza("페페로니피자", 15000);
        
        Pizza Hawaiian = new Pizza("하와이안피자",20000);
        
        Peperoni.Introduce();
        System.out.println();
        Hawaiian.Introduce();

        //-------------------------------------------------------------

        //Chicken

        Chicken pipi = new Chicken(5, "삐삐", 150000);
        Chicken haha = new Chicken(6, "하하", 200000);

        pipi.Introduce();
        pipi.JiggleJiggle();
        pipi.GetPrice();

        haha.Introduce();
        haha.JiggleJiggle();
        haha.GetPrice();

        //-------------------------------------------------------------

        //Berverage
        
        String[] menu = {"estus"};
        int[] price = {50000};
        int[] countt = {10};
        Beverage estus = new Beverage(menu, price , countt);
        estus.ShowBeverage();
        estus.OrderBeverage(0);
        estus.GetPrice(0);

         
        
    }
    
}
