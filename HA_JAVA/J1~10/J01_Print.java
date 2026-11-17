// J01_Print.java
public class J01_Print{
    public static void main(String[] args){
        // 실행방법 : F5 또는 Run버튼 또는 우측상단 > 클릭
        System.out.println("나는 엔터를 자동으로 함"); // 세미콜론!!
        System.out.print("나는 엔터 안띄쥐롱~~");
        System.out.print("그래서 이어서 출력됨.\n 강제엔터\n");
        System.out.printf("나는 포맷 이용한 출력 %d\n", 111);
        /*
        * println - 가장 많이 사용예정. 출력후 엔터 자동띄워줌
        * print   - 여러개 출력시 사용됨. 출력후 엔터 안해줌
        * printf  - 형식 지정. 소수점 형식 변경 등에 사용. 여러변수 출력!
        */
    }
}