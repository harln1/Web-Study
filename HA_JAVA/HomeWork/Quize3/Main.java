package HomeWork.Quize3;


public class Main {
    public static void main(String[] args) {
        
        //Chicken

        Chicken ch = new Chicken(4, "뿌링클", 20000);
        Chicken ck = new Chicken(4, "바사삭", 15000);
       
        ch.Introduce();
        ch.JiggleJiggle();
        ch.GerPrice();

        System.out.println();
        System.out.println("--------------");

        ck.Introduce();
        ck.JiggleJiggle();
        ck.GerPrice();

        System.out.println();
        System.out.println("--------------");

        //--------------------------------------------------------------

        //Beverage1

        Beverage1 bev = new Beverage1(1);
        bev.Show();
        bev.Order(0);
         System.out.println("--------------");

        //--------------------------------------------------------------

        //Player

        Player pl = new Player();
        pl.Introduce();
        pl.Attacked(100);
        
        System.out.println();
        System.out.println("--------------");

        //----------------------------------------------------------------

        //Zombie

        Player pla = new Player(); 
        Zombie z1 = new Zombie(); 
        Zombie z2 = new Zombie();

        z1.interaction(); 
        z2.interaction();

        z1.Attack(pla);    
        z1.Attacked(70);  


       





        
    }   
}
