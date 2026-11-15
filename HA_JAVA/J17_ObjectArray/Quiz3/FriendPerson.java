package J17_ObjectArray.Quiz3;

public class FriendPerson extends Person{
    String secret;
    // 멤버변수 name, age 를 부모 생성자로 초기화 + Secret도 생성자로 초기화
    FriendPerson(String name, int age, String secret){
        super(name, age);
        this.secret = secret;
    }
//     메소드
// Introduce - 부모 메소드 실행 후 "피방 ㄱ?" 를 출력한 후, PrintSecret을 실행하세요
    @Override
    void Introduce() {
        super.Introduce();
        System.out.println("피방 ㄱ?");
        PrintSecret();
    }
// PrintSecret - 비밀을 출력하세요
    void PrintSecret(){
        System.out.println(secret);
    }

}
