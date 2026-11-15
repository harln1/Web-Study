import java.util.Random;
import java.util.Scanner;

public class J08_While {
    public static void main(String[] args) {
        // < 반복문 - While >
        // ★ 무한반복에만 사용할 것 !
        // while(조건식){실행할놈들}
        // ★★★ 조건식이 true면 실행 아니면 끝.
        // break는 즉시 종료, continue 조건식 순간이동
        // --------------------------------------
        while(true){
            System.out.print("자바가 너무 좋아 ");
            break;
        }
        int i = 10;
        while(i>=0){
            System.out.println(i--); // i--
            //i = i-1; // i-=1;   i--;   --i;
        }

        for(int j=10; j>=10; j--){
            System.out.println(j);
        } // 유한반복은 for를 쓰는게 일억배 낫다.
        // ----------------------------------------
        // < 강화 시스템 만들기 >
        // 1. 성공확률 50%
        // 2. 성공시 "+"를 맨 앞에 붙이기
        // 3. 실패시 "대변경단"으로 변경하고 반복문 끝.
        // 4. 성공했다면 더 진행할건지 Y/N로 물어보기
        // 5. 진행하기로 했다면 다시한번 강화 진행
        // ----------------------------------------
        String 장비 = "무한의 대검";
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        while(true){
            int ball = rand.nextInt(100)+1; // 1 ~ 100
            if(ball<=50){
                System.out.println("★ 경 축 ★");
                System.out.print(장비 + " -> ");
                장비 = 장비 + "+";
                System.out.println(장비);
                System.out.print("쫄(Y/N)? : ");
                String jjol = scan.nextLine();
                if(jjol == "Y"){
                    // 쫄았음.
                    System.out.println("겁쟁이는 나가라");
                    break;
                }
                else{
                    System.out.println("다음단계 진행...!");
                }
            }
            else{
                // 한번이라도 실패하면 대변경단 + 즉시종료
                System.out.println("띠로리.....");
                System.out.print(장비 + " -> ");
                장비 = "대변경단";
                System.out.println(장비);
                break;
            }
        }

        // < 강화 V2 >
        // 1. 10% 대성공, 50%성공, 30%실패 10%파괴
        // 2. 대성공 -> 강화수치 + 2
        // 3. 성공   -> 강화수치 + 1
        // 4. 실패   -> 강화수치 - 1
        // 5. 파괴   -> 강회수치 = 0
        // 6. 강화 진행 후, 더 할건지 물어봐야함
        // 출력양식 : [검잇기의 대검 + 3]
        // 7. 발견된 문제. 실패시 음수가 나오면 안됨
        //    음수가 나올 경우 0으로 강제로 조정 필요
        장비 = "유령 무희";
        int 강화수치 = 0;
        // ★ 10강 달성시 커피 쿠폰 지급!!!
        while(true){
            // 랜덤 공 뽑기
            int ball = rand.nextInt(100) + 1; // 1 ~ 100
            // ----------------------
            // 확률따라 코드 처리
            if(ball<=10)     { 강화수치 += 2; }
            else if(ball<=60){ 강화수치 += 1; }
            else if(ball<=90){
                if(강화수치>0){
                    강화수치 -= 1;
                }
                else{
                    강화수치 = 0;
                }
            }
            else{              강화수치 = 0;  }
            // ----------------------
            System.out.printf("[%s] + %d\n",장비, 강화수치);
            // 더할지 말지 결정
            System.out.print("그만하려면 0을 입력하세요 : ");
            int choice = scan.nextInt();
            if(choice==0){
                break;
            }
        }

        scan.close();





    }
}
