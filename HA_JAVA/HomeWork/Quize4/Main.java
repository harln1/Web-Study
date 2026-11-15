package HomeWork.Quize4;

public class Main {
    public static void main(String[] args) {

    

        //Vehicle
        Vehicle ve = new Vehicle("popo", 5, 99999999);
        ve.Move();

        System.out.println("--------");

        //Minon , CannonMinion ,CannonMinion
        Minion m = new Minion(300, 20, 15, 0.8);
        m.LevelUP();

        System.out.println();

        CannonMinion cm = new CannonMinion();
        cm.Attack();  
        cm.LevelUP(); 

        System.out.println();

        WizardMinion wm = new WizardMinion();
        wm.Attack();  
        wm.LevelUP(); 



        
    }
    
}
