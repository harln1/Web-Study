// Chiikawa.java
package J14_Constructor;

public class Chiikawa {
    // --------------------------------------
    String name;
    String birthday;
    String motive;
    String[] special; // 랜덤 출력
    // --------------------------------------
    // < 생성자 > 는 우선 메소드로 만들고 구현 예정
    public Chiikawa(String name,   String birthday,
                    String motive, String[] special){
        this.name = name;
        this.birthday = birthday;
        this.motive = motive;
        this.special = special;
    }
    // public Chiikawa(){}
    // --------------------------------------
    void Setting(String name,   String birthday,
                 String motive, String[] special){
        this.name = name;
        this.birthday = birthday;
        this.motive = motive;
        this.special = special;
    }
}
