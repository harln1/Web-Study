// Animal.java
package J15_Inheritance;

// 부모클래스가 될 예정. 
public class Animal {
    // ------------------------------------------
    // 공통된 필드 -> name, age    
    String name;
    int age;
    int hp;
    int power;
    // ------------------------------------------
    // 생성자는 name, age에 대해서
    Animal(String name, int age){
        this.name = name;
        this.age = age;
        this.hp = 100;
        this.power = 10;
    }
    // ------------------------------------------
    // 공통된 메서드 -> Sleep, Eat
    void Sleep(){
        System.out.println("쿨쿨");
    }
    void Eat(){
        System.out.println("냠냠");
    }
    void Hunt(){
        System.out.println("어둠에 빠진 자들을 사냥해 볼까?");
    }
}
