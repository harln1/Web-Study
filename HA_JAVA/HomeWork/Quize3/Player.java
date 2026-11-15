package HomeWork.Quize3;

import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);

    String name;
    int hp;
//--------------------------------------------------

    Player(){
       
        System.out.println("이름을 입력해 주세요 : ");
        this.name = scanner.next();

        this.hp = 200;
    }

    Player(String name,int hp){
        this.name = name;
        this.hp = hp;
    } 

    void Introduce(){
      
        System.out.println("이름:"+name+" , 체력:"+hp);
       
    }
    void Attacked(int damage){

        this.hp -= damage;

        if(hp<=0){
            Die();
        }else{
            System.out.println("("+name+")님 이 생존했습니다.\n"+
            "(damage:-"+damage+"  hp:"+hp+")");
        }

    }
    void Die(){
        System.out.println("("+name+")님 이 사망했습니다");
    }

    
    
    
}
