package J19_Stack;

import java.util.Random;
import java.util.Stack;

public class ShotGun {
    int maxCapacity;
    Stack<Bullet> magazine;
    // ------------------------------
    ShotGun(){
        this.magazine = new Stack<>();
        this.maxCapacity = 5;
        Reload();
    }
    // ------------------------------
    void Reload(){
        int temp = maxCapacity - magazine.size();
        for(int i=0; i<temp; i++){
            Random rand = new Random();
            int ball = rand.nextInt(2); // 0 ~ 1
            if(ball==0)
                magazine.push(new BuckShot());
            else
                magazine.push(new APSlug());
        }
        System.out.println("재장전 완료");
    }
    void Fire(){
        if( magazine.isEmpty() == true ){
            System.out.println("틱..(재장전필요)");
        }else{
            //magazine.pop().Fire();
            Bullet bullet = magazine.pop();
            bullet.Fire();
        }
    }
}
