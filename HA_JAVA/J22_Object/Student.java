package J22_Object;

import java.util.Objects;

public class Student {
    // -------------------------------------
    // < 필드 >
    String name;
    int studentID;
    static int idCnt = 1000;
    // -------------------------------------
    // < 생성자 >
    Student(String name){
        // studentID에 idCnt 값을 삽입. 이후 idCnt++
        this.studentID = idCnt++;
        this.name = name;
    }
    // -------------------------------------
    // < 메소드 >
    // toString
    // Name : x, ID : y 와 같은 형식으로 String값 리턴
    @Override
    public String toString() { // 객체를 그냥 출력할 때 아래를 반환
        String result = "Name : " + name + ", ID : " + studentID;
        return result;
    }
    // equals
    // obj가 Student 클래스인지 확인. 같은 클래스인 경우 studentID가 
    // 같으면 true 그 외 모든 경우에 대해서는 false 처리
    @Override
    public boolean equals(Object obj) {
        if( obj instanceof Student){
            if(this.studentID == ((Student)obj).studentID){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    // hashCode
    // studentID를 기준으로 해시 값 생성
    @Override
    public int hashCode() {
        // return this.studentID;
        // 해시코드 -> 원본값을 이용해서 다른 값을 만드는 기법
        return Objects.hash(this.studentID);
        // import java.util.Objects; 위에 이거 들어가야함
    }
}
