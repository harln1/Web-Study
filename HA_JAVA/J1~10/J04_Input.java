// J04_Input.java
import java.util.Scanner;

public class J04_Input {
    public static void main(String[] args) {
        Scanner dongas = new Scanner(System.in);
        //소속    이름    생성  얘로
        // ----------------------------------------
        // 문자열 입력받기
        System.out.print("너의...이름은..? : ");
        String name = dongas.nextLine(); // 한줄 전체
        System.out.println("용사님의 이름은 ... " + name);

        // ----------------------------------------
        // 정수하나 입력받아주기
        int tongjang = 0;
        System.out.print("얼마 입금? : ");
        tongjang = dongas.nextInt();
        System.out.println("통장잔고 : " + tongjang);

        // 추석 조카들에게 용돈주기...(진짜싫음)
        System.out.print("첫째조카 얼마용돈?(중학생됨) : ");
        int joka = dongas.nextInt();
        tongjang = tongjang - joka;
        System.out.println("통장잔고 : " + tongjang);
        // < 실습 >
        // 아래 인원들의 변수를 만든 후, 입력받아 내 통장잔고에서
        // 뺀 후, 얼마 남았는지 출력하세요
        // (추가예제) 할머니 이후, 페이백을 받아 용돈을 추가받으세요

        // 부모님
        System.out.print("부모님용돈얼마?(결혼안했음) : ");
        int bumo = dongas.nextInt();
        tongjang = tongjang - bumo;
        System.out.println("통장잔고 : " + tongjang);
        // 할아버지
        System.out.print("할아버지 용돈얼마? : ");
        int hal = dongas.nextInt();
        tongjang = tongjang - hal;
        System.out.println("통장잔고 : " + tongjang);
        // 할머니
        System.out.print("할머니 용돈얼마? : ");
        int money = dongas.nextInt();
        tongjang = tongjang - money;
        System.out.println("통장잔고 : " + tongjang);
        // (추가예제)
        System.out.println("아이고.. 난 이런거 필요없다...");
        tongjang = tongjang + 100000;
        System.out.println("통장잔고 : " + tongjang);
        // 친동생
        System.out.print("얼마 받고싶어?? : ");
        dongas.nextInt();
        System.out.println("넌 없어 임마.");
        System.out.println("통장잔고 : " + tongjang);

        // ----------------------------------------
        dongas.close();
    }
}
