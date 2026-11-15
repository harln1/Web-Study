package HomeWork.Quize3;

import java.util.Random;

public class Zombie {
   
    String name;
    int hp;
    
    //---------------------------------------------

    static int count = 0;

    
    public Zombie() {
       
        count++;
        this.name = "Zombie" + count;

        
        Random rand = new Random();
        this.hp = rand.nextInt(21) + 40; 
    }

    //---------------------------------------------

    void interaction() {
        System.out.println("으어어어....(" + this.name + ")");
    }

   
    void Attack(Player player) {
        System.out.println("으어으어(이걸 못 피하네)");
        player.Attacked(10); 
    }

   
    void Attacked(int attackPower) {
        this.hp -= attackPower;

        if (this.hp < 0) { 
            System.out.println("(" + this.name + ") 이 처치되었습니다.");
        }
    }
}
