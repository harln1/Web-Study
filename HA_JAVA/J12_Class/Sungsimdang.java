// Sungsimdang.java
package J12_Class;

// 빵집 알바
public class Sungsimdang {
    // Static Method - 채용공고꺼
    static void AlbaIntroduce(){ // 얘는 객체가 필요없음
        System.out.println("[  선택지  ]");
        System.out.println("1. 일시키기");
        System.out.println("2. 자기소개시키기");
        System.out.println("3. 이름바꾸기");
        System.out.println("4. 종료하기");
    }
    //----------------------------------
    // < 필드 >
    //----------------------------------
    int pay;
    int startTime;
    int endTime;
    String nickName;
    //----------------------------------
    // < 생성자 >
    //----------------------------------
    //----------------------------------
    // < 메소드 >
    //----------------------------------
    void Setting(){
        this.pay = 2100;
        this.startTime = 6;
        this.endTime = 12;
        this.nickName = "Sung";
    }

    // 급여, 시작시간, 끝시간, 닉네임 설정
    void Setting(int pay    , int startTime  ,
                 int endTime, String nickName){
        this.pay       = pay;
        this.startTime = startTime;
        this.endTime   = endTime;
        this.nickName  = nickName;
    }
    // --------------------------
    void Work(){
        System.out.println("열심 열심 ..!");
    }
    void ChangeName(String name){
        this.nickName = name;
        System.out.println("닉네임 변경 완료! 감삼다!");
    }
    void Hello(){
        System.out.println("쥐꼬리만한 내 연봉 : " + pay);
        System.out.println("출근하기 싫은 시간은? : " + startTime);
        System.out.println("이때만 기다려요 : " + endTime);
        System.out.println("제 이름은... : " + nickName);
    }
}
