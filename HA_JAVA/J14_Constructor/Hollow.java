// Hollow.java
package J14_Constructor;

// 망자(적)
public class Hollow {
    // --------------------------
    int hp;
    int power;
    String deadSound;
    boolean isAlive;
    String name;
    static int num = 1;
    // --------------------------
    Hollow(){
        this.hp = 20;
        this.power = 8;
        this.deadSound = "쿠오에엑";
        this.isAlive = true;
        this.name = "망자"+(num++);
    }
    // --------------------------
    void GetDamage(DarkSoul 불사자){
        this.hp -= 불사자.GetDamage();
        if(this.hp<=0){
            this.isAlive = false;
        }
    }
    void TakeDamage(DarkSoul 불사자){
        불사자.TakeDamaged(this.power);
    }

}
