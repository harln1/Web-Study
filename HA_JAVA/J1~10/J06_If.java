import java.util.Scanner;

public class J06_If {
    public static void main(String[] args) {
        // < 조건식 >
        // if(조건식){} else{}
        // else는 필수가 아님. 필요없으면 안 써도 됨
        // 조건식은 true/false가 나오는 형태. 보통 비교연산자
        // 정말정말정말중요함. 중괄호 생략할 생각 하지 말 것.
        // --------------------------------------------
        int soul = 1000;
        if(soul>=2500){
            System.out.println("그레이트소드");
        }
        else{
            System.out.println("대변경단");
        }
        // ---------------------------
        if(soul>=2500){
            System.out.println("그레이트소드");
        }
        else{
            // 2500원도 없는 상황
            if(soul>=1500){
                // 2500은 없지만 1500보다는 이상
                System.out.println("쯔바이헨더");
            }
            else{
                System.out.println("대변경단 먹어라");
            }
        }
        // ----------------------------------------
        // < 여자친구 마음 맞추기 >
        String 속마음 = "엽기떡볶이 마라로제엽떡 기본맛 비엔나추가";
        String 예측 ; // 키보드로 입력받을 예정
        Scanner dongas = new Scanner(System.in);
        System.out.print("속마음을 맞춰봐 : ");
        예측 = dongas.nextLine();

        if(속마음 == 예측){
            System.out.println("넌 날 너무 잘알아..♡");
        }
        else{
            // 기회를 한번 써버림...
            System.out.print("속마음을 맞춰봐 : ");
            예측 = dongas.nextLine();
            if(속마음 == 예측){
                // 2번째 기회에 정답
                System.out.println("휴. 실망할 뻔 했네!");
            }
            else{
                // 2번째에 틀렸음....ㅠㅠㅠㅠ
                System.out.print("속마음을 맞춰봐 : ");
                예측 = dongas.nextLine();
                if(속마음 == 예측){
                    // 마지막 기회에 성공!
                    System.out.println("ㅡㅡ 왜 모르는척해!");
                }
                else{
                    // 3번째 기회 모두 소진
                    System.out.println("나 집갈래");
                }
            }
        }
        dongas.close();
    }
}
