package J22_Object;

public class Point {
    // -----------------------------------------------
    // < 필드 >
    int x;
    int y;
    // -----------------------------------------------
    // < 생성자 >
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    // -----------------------------------------------
    // < 메소드 >
    // toString
    // x : xValue , y = yValue  와 같은 형식으로 출력
    @Override
    public String toString() {
        String result = "x : " + x + ", y : "+ y;
        return result;
    }
    // equals
    // x와 y의 값이 모두 동일할 경우 true, 그렇지 않으면 false
    @Override
    public boolean equals(Object obj) {
        if(this.x == ((Point)obj).x && this.y == ((Point)obj).y){
            return true;
        }else{
            return false;
        }
    }
    // hashCode
    // x와 y의 절대값을 더한 후, x에는 31, y에는 49을 곱해 100으로 나눈 나머지를
    //  hashCode값으로 설정
    @Override
    public int hashCode() {
        int result = ( Math.abs(x)+Math.abs(y) +x*31 + y*49 )/100;
        return result;
    }

}
