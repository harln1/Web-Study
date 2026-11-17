// Hunter.java
package J12_Class;

/*
  < 각 캐릭터가 가지고 있어야하는 정보는? >
    이름, 성별, 나이, 필살기대사, 주요대사, 기쁜멘트

  < 캐릭터가 할 수 있어야 하는 행동은? >
    캐릭터 세팅, 자기소개, 기쁨표현, --슬픔표현, 화난표현--, 대사읇기
*/
public class Hunter {
    // -------------------------------------------
    // 위의 정보들을 잘 나타낼수 있게 이름, 자료형 알아서 ㄱㄱ
    // 이름, 성별, 나이, 필살기대사, 주요대사, 기쁜멘트
    String name; String gender; int age;
    String finishLine; String SpecialLine; String happyLine;
    // -------------------------------------------
    // 생성자 읎음
    // -------------------------------------------
    // 캐릭터가 할 수 있는 행동들을 "내가 가진" 정보를 이용해서
    // 메소드를 만드세요
    // 캐릭터 세팅, 자기소개, 기쁨표현, 대사읇기
    void CharSetting(String name, String gender, int age,
                     String finishLine, String SpecialLine,
                     String happyLine){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.finishLine = finishLine;
        this.SpecialLine = SpecialLine;
        this.happyLine = happyLine;
    }
    void CharIntroduce(){
        System.out.println("이름 : " + this.name);
        System.out.println("나이 : " + this.age );
        System.out.println("성별 : " + this.gender);
    }
    void CharPrintHappy(){
        System.out.println(this.happyLine);
    }
    void CharPrintSpecial(){
        System.out.println(this.SpecialLine);
    }
}
