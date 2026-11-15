package J13_Static;

public class Main {
    public static void main(String[] args) {
        // 객체 생성 -> static안달린거 가져감
        // static -> 싸장님꺼 -> 공유자원
        System.out.println(Util.age);
        for(int i=0; i<13; i++){
            Util.PrintHello();
        }

        // static은 객체가 사용이 가능하긴함..
        Util ut = new Util();
        System.out.println(ut.age);
        ut.PrintHello();



    }
}
