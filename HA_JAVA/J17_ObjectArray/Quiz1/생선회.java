package J17_ObjectArray.Quiz1;

public class 생선회 extends Food {
    생선회(){
        super("생선회", 20);
    }    
    @Override
    int Sales(){
        System.out.println("뼈 조심해서드세요!");
        return super.Sales(); // 부모 메소드실행-리턴
    }
}
// 새우회 클래스, 25원, "새우알러지 있으면 말씀해주세요"
// 나머지 로직 동일.
