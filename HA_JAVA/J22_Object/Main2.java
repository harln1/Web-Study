package J22_Object;

public class Main2 {
    public static void main(String[] args) {
        Friend 민정 = new Friend("민정", 33);
        Friend 대성 = new Friend("대성", 33);

        System.out.println(민정==대성);
        System.out.println(민정.equals(대성));
    }
}
