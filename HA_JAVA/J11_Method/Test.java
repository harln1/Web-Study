package J11_Method;

import java.util.Random;

public class Test {
    // 메인 클래스가 아니면 main메소드 절대 넣으면 안됨
    // ---------------------------------------------------
    // 🍺 매개변수(준비물) X 리턴(돌려주기 ; void) X
    // ---------------------------------------------------
    void PrintPepsi(){
        System.out.println("펩시매에에에에엔~!~~~~");
        System.out.println("둥 둥 두둥 둥 둥 두둥");
        System.out.println("펩시매에에에에엔~!~~~~");
    }
    void Print1To25(){
        for(int i=0; i<25; i++){
            System.out.print((i+1) + " ");
        }
        System.out.println();
    }
    void PrintRandom(){
        // 1~100중 랜덤값 하나 출력
        Random rand = new Random();
        System.out.println("랜덤값 : " + (rand.nextInt(10)+1) );
    }
    // ---------------------------------------------------
    // 🍻 매개변수(준비물) O 리턴(돌려주기 ; void) X
    // ---------------------------------------------------
    // 숫자하나 넘겨주면 1부터 그 숫자까지 출력해주는 함수
    void Print1ToNum(int num){
        for(int i=0; i<num; i++){
            System.out.print( (i+1) + " ");
        }
        System.out.println();
    }

    // 로그인 결과 출력
    void PrintLogin(String id, String pw){
        String originId = "dskadska1210";
        String originPw = "1234";

        if(id==originId && pw==originPw){
            System.out.println("[SYS] 로그인 성공");
        }else{
            System.out.println("[WAR] 누구냐 넌...");
        }
    }

    // 문자열을 넘겨주면 그 문자열이 내맘에 쏙 드는지 출력하는 함수
    void PrintMyLove(String response){ 
        String answer = "마라로제엽떡비엔나추가";

        if(answer == response){
            System.out.println("역시 넌 날 잘 알아");
        }else{
            System.out.println("정말 실망이야...");
        }
    }

    // 배열 하나 넘겨받아 모든 요소 출력하기
    void PrintArray(int[] ary){
        for(int i=0; i<ary.length; i++){
            System.out.print(ary[i] +" ");
        }
        System.out.println();
    }
    // 이차원배열 하나 넘겨받아 모든 요소 출력하기
    void PrintDArray(int[][] ary){
        for(int i=0; i<ary.length; i++){
            PrintArray(ary[i]);
        }
    }

    // ---------------------------------------------------
    // 🍸 매개변수(준비물) X 리턴(돌려주기 ; void) O
    // 사용처가 별로 없음... -> 고정된 값이 필요한 경우 사용!!
    // 리턴이 있으면 함수 이름 앞에 Get을 붙일 것!!!
    // ---------------------------------------------------
    // 랜덤값 돌려주기
    int GetRandom(){
        Random rand = new Random();
        return rand.nextInt(100);
    }

    // API Key값 돌려주기
    // API - 누가 만들어둔 코드들 사용하기위한 ID값
    String GetAPIKey(){
        String key = "SLKD-JFHA-SFD4-12hJGHFJD7893565";
        System.out.println("KEY를 반환합니다.");
        return key;
    } 

    // ---------------------------------------------------
    // 🥃 매개변수(준비물) O 리턴(돌려주기 ; void) O
    // ---------------------------------------------------
    // 가챠 n 연뽑
    String GetGatcha(int cnt){
        String result = "";
        String[] charList = {"꽝","라플란드","켈시","엑시아","아미야","쏜즈","실버애쉬"};
        Random rand = new Random();

        for(int i=0; i<cnt; i++){
            int choice = rand.nextInt( charList.length ); // 5 ->0~4
            result += charList[choice]+" ";
        }

        return result;
    }

    // 검 강화하기
    // 검 이름 하나 넘겨받아 50% 확률로 "찬란한", 50% 확률로 "대변경단"
    // 만들어서 넘겨주기
    String GetSwardUpgrade(String sward){
        System.out.println("[NPC] 퍼거스");
        System.out.println("그래. 이걸 강화할테니 좀 기다려주겠나?");
        
        if(GetRandom() >=50 ){
            sward = "찬란한 " + sward;
            System.out.println("강화에 성공했네.") ;
        }else{
            sward = "대변경단";
            System.out.println("어이쿠 손이 미끄러졌네...");
        }
        return sward;
    }

    // 숙제
    // 메소드이름         해야하는거
    // Enter 			> print "\n================\n"
    void Enter(){
        System.out.println("\n=================\n");
    }
    // PrintNumStar( int star ) 	> print "*" x star
    void PrintNumStar(int star){
        for(int i=0; i<star; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    int[] GetAry(int size){
        int[] array = new int[size];
        return array;
    }
    // 26 27 29 30 골라서 2개씩 만들고 다만들면 집갑쉬다.
    // 최대 5:30까지!
}
