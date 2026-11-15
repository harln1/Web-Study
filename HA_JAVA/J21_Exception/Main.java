package J21_Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] colors = {"red","blue","green"};
        System.out.println("너는 무슨 색이 좋니?(의심)");
        Scanner dongas = new Scanner(System.in);
        int choice = 0;
        try{
            choice = dongas.nextInt(); // 주의~!
        }
        catch(java.util.InputMismatchException 김치찌개){
            System.out.println("숫자를 입력해야지!!!!!");
            System.out.println("Chocie는 1로 알겠다.");
            choice = 1;
        }
        catch(Exception 순두부찌개){
            while(true){
                System.out.println("어디가는거야? 내가 싫어??????");
            }
        }


        try{
            System.out.println(colors[choice]);
        }
        catch(ArrayIndexOutOfBoundsException 된장찌개){
            System.out.println("마 똑바로 입력 안하나.");
            System.out.println(된장찌개.getMessage());

        }
        catch(Exception 순두부찌개){
            System.out.println("알 수 없는 에러 발생.");
            System.out.println("관리자에게 연락주세요 ( 1533-9999 )");
        }
        
        dongas.close();
    }
}
