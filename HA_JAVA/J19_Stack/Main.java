package J19_Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        // <객체자료형> => Generic 제네릭
        // int->Integer, double -> Double
        // int, double, boolean -> Primitive Type
        // Reference Type -> Integer, Double, Bullet, Book
        // 객체 타입
        st.push(123);
        st.push(456);
        st.push(789);
        System.out.println("----");
        int size = st.size();
        // for(int i=0; i<size; i++){
        //     System.out.println(st.pop());
        // }
        while( !st.isEmpty() ){
            System.out.println(st.pop());
        }

        // 한개씩 꺼내고 싶어용!
        if(st.isEmpty() == true){
            System.out.println("비어있음");
        }else{
            st.pop();
        }
        System.out.println("-------------------");
        System.out.println("-------------------");
        System.out.println("-------------------");
        System.out.println("-------------------");
        System.out.println("-------------------");
        // 총 실습
        ShotGun M1983 = new ShotGun();
        M1983.Fire();
        M1983.Fire();
        M1983.Fire();
        M1983.Fire();
        M1983.Fire();
        M1983.Fire();
        M1983.Reload();
        M1983.Fire();
        M1983.Fire();
        M1983.Fire();
        M1983.Fire();
        M1983.Fire();
    }
}
