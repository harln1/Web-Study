package J22_Object;

class TestA{}  class TestB{}
public class Main {
    public static void main(String[] args) {
        TestA a1 = new TestA();
        TestA a2 = new TestA();
        TestB b1 = new TestB();
        TestB b2 = new TestB();
        TestA a3 = a1; TestB b3 = b1;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    
    }
}
