package J15_Inheritance;

public class Squirrel extends Animal{
    // ----------------------------------
    private int magic;
    // ----------------------------------
    public Squirrel(String name, int age){
        super(name, age);
        this.magic = 20;
    }
    public Squirrel(String name, int age, int magic){
        this(name, age);
        this.magic = magic;
    }
    // ----------------------------------
    void WaterBolt(){
        System.out.println("아쿠아 레기아(Aqua Regia)");
    }
}
