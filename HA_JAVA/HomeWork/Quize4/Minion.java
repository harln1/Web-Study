package HomeWork.Quize4;

public class Minion {

    int hp;
    int gold;
    int attackPower;
    double attackSpeed;
    //-------------------------------------
    Minion(int hp,int gold,int attackPower , double attackSpeed){
        this.hp = hp;
        this.gold = gold;
        this.attackPower = attackPower;
        this.attackSpeed = attackSpeed;
    }
    //-------------------------------------
    void LevelUP(){
        this.hp += 100;
        System.out.println("LevelUP!  현재 체력:"+this.hp);
    }
    
    
}
