package J15_Inheritance;

public class Dog extends Animal {
    // ----------------------------------
    private int strength;
    // ----------------------------------
    public Dog(String name, int age){
        super(name, age);
        this.strength = 10;
    }
    public Dog(String name, int age, int strength){
        this(name, age);
        this.strength = strength;
    }
    // ----------------------------------
    void PowerStrike(){
        System.out.println("파워 스트라이크!");
    }
    @Override
    void Sleep(){
        System.out.println("강아지가 대충 자는소리");
        super.Sleep();
    }
}
