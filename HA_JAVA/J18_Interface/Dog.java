package J18_Interface;
import java.awt.Toolkit;

public class Dog implements Animal {

    @Override
    public void Eat() {
        System.out.println("콰자ㅗㄱㅈ아잦가ㅗ아ㅗ노강");
        Toolkit.getDefaultToolkit().beep();
    }

    @Override
    public void Sleep() {
        System.out.println("Zzz,Zzz...Zzz...");
    }

    @Override
    public void Attack() {
        System.out.println("너 내가 개로 보이지? 콰직");
    }

    @Override
    public void Transform() {
        System.out.println("벼 신 !");
    }
    
}
