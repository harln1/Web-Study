package HomeWork.Quize4.Animall;

public class Dog extends Animal{

    int strength;
    //----------------------------------
    Dog(String name , int age){
        super(name, age);
        this.strength = 10;

    }

    Dog(String name , int age, int strength){
        super(name, age);
        this.strength = strength;
    }

    //----------------------------------

    void PowerStrike(){
        System.out.println("파워 스트라이크");
    }

    @Override
    void Sleep() {
        System.out.println("새근새근");
        super.Sleep();
    }

    
}
