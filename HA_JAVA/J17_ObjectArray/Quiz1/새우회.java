package J17_ObjectArray.Quiz1;

public class 새우회 extends Food {
    새우회(){
        super("새우회", 25);
    }
    @Override
    int Sales(){
        System.out.println("새우 알러지 있음 이야기해주세용");
        return super.Sales(); 
    }
}
