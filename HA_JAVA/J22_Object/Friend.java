package J22_Object;

import java.util.Random;

public class Friend {
    String name;
    int age;
    Random Dual;

    Friend(String name, int age){
        this.name = name;
        this.age  = age;
        this.Dual = new Random();
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("나와 친구인지 듀얼로 확인하자");
        int rand = Dual.nextInt(2); // 0 1
        if(rand==1){
            return true ;
        }else{
            return false;
        }
    }
}
