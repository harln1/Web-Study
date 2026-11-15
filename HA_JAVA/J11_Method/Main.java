package J11_Method;
/*
    < 함수와 메소드의 차이 >
    > 함수   : 클래스 밖에 선언
    > 메소드 : 클래스 안에 선언

    < 언제 메소드를 만들어야 할까? >
    > 같은 로직을 두번 이상 사용하거나 해야 할 경우

    < 메소드 사용 방법 >
    1. static -> 클래스꺼
    2. non-static ★ -> 객체꺼

    < 클래스는 뭐고 객체는 뭔데? >
    1. 객체
    아르바이트생(사람) - 연봉, 출근 퇴근시간, 근무장소 = 정보(필드)
                    청소하기, 주문받기, 설거지하기 = 행동(메소드)
    2. 클래스 - 객체를 만드는 청사진, 틀 어쩌고쩌고쩌고 딲딱..
    알바가 해야 하는 일들을 적어놓은 채용공고 = 회사
    채용공고를 보고 뽑힌 알바는 공고에 적힌것들을 할 수 있고 아는상태
      => 내부교육 진행(생성자)
    하나의 클래스는 하나의 주제만 담아야 한다!!!

*/


public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t.Print1To25() ;
        t.PrintPepsi() ;
        t.PrintRandom();
        // ------------------------
        // 매 O 리 X
        t.Print1ToNum(99);
        t.PrintLogin("dskadska1210", "1234");
        t.PrintLogin("dskadska1210", "asdfs");
        t.PrintMyLove("마라로제엽떡비엔나추가");
        // ------------------------
        // 매 X 리 O
        int r = t.GetRandom();
        System.out.println("랜덤값 : " + r);
        System.out.println("랜덤값 : " + t.GetRandom());//1회용
        // ------------------------
        // 매 O 리 O
        String character = t.GetGatcha(10);
        System.out.println(character);

        String mySward = "그레이트소드";
        mySward = t.GetSwardUpgrade(mySward);
        System.out.println("사랑하는 나의 " + mySward);

        // --------------------------------------------
        int[] ary1 = {1,2,3,4,5,6,7,8,8,345,23,42423,4234,23424,2345};
        int[][] ary2 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        t.PrintArray(ary1);
        t.PrintDArray(ary2);
    }
    // 반복->메소드->클래스->상속->인터페이스->추상클래스->내부클래스->람다식
}
