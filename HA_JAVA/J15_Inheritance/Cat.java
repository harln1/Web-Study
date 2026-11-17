package J15_Inheritance;

public class Cat extends Animal{
    // ----------------------------------
    private int stealth;
    // ----------------------------------
    public Cat(String name, int age){
        super(name, age);
        this.stealth = 15;
    }
    public Cat(String name, int age, int stealth){
        this(name, age);
        this.stealth = stealth;
    }
    // ----------------------------------
    void StealthAttack(){
        System.out.println("냥냥 펀치");
    }
    @Override 
    void Eat(){
        System.out.println("까드득");
    }
}
