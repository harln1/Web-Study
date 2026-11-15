package J12_Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 성심당 알바 채용!
        Sungsimdang alba1 = new Sungsimdang();
        Sungsimdang alba2 = new Sungsimdang();
        // 알바 설정하기
        alba1.Setting(); // 진열
        alba2.Setting(4000, 4, 10, "기계1호");

        Scanner dongas = new Scanner(System.in);
        // 메소드 실행 - 재미 없음 ㅠㅠ -> 턴제방식!
        while(true){
            // System.out.print("\033[H\033[2J");
            // System.out.flush();

            // 1번 알바
            Sungsimdang.AlbaIntroduce();
            System.out.print("1번알바 지시 : ");
            int choice1 = dongas.nextInt();
            if(choice1 == 1){
                alba1.Work();
            }else if(choice1 == 2){
                alba1.Hello();
            }else if(choice1 == 3){
                // 이름 입력 받아야 함...
                System.out.print("변경할 이름 : ");
                String temp = dongas.nextLine();
                alba1.nickName = temp;
            }else if(choice1 == 4){
                break;
            }

            // 2번 알바
            Sungsimdang.AlbaIntroduce();
            System.out.print("2번알바 지시 : ");
            int choice2 = dongas.nextInt();
            if(choice2 == 1){
                alba2.Work();
            }else if(choice2 == 2){
                alba2.Hello();
            }else if(choice2 == 3){
                // 이름 입력 받아야 함...
                System.out.print("변경할 이름 : ");
                String temp = dongas.nextLine();
                alba2.nickName = temp;
            }else if(choice2 == 4){
                break;
            }
        }
        // ============================
        // 복권 판매
        Lotto 제발1 = new Lotto();
        Lotto 제발2 = new Lotto();

        제발1.SettingLotto();
        // 제발2번은... 까먹음 (데헷 ★)

        제발1.CheckWinner();
        System.out.println("----------");
        제발2.CheckWinner();
        // -------------------------
        // 헌터X헌터
        Hunter hisoka = new Hunter();
        hisoka.name = "히소카";
        hisoka.gender = "남자";
        hisoka.age = 28;
        hisoka.finishLine = "번지 껌";
        hisoka.SpecialLine = "그 눈빛...아주 좋아♡";
        hisoka.happyLine = "흐응~";
        
        // hisoka.CharSetting("히소카", "남자", 28, 
        //                    "번지 껌",
        //                    "그 눈빛...아주 좋아♡", 
        //                    "흐응~");
        hisoka.SpecialLine = "흐응?";
        
        hisoka.CharIntroduce();
        hisoka.CharPrintHappy();
        hisoka.CharPrintSpecial();

    }
}
