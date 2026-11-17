package J22_Object;

public class Main3 {
    public static void main(String[] args) {
        Student s1 = new Student("대성"); // 1000
        Student s2 = new Student("민재"); // 1001
        Student s3 = new Student("규민"); // 1002
        s3.studentID = 1000; // 바뀌면 원래는 안됨 ㅠㅠㅠ / 1002->1000

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1.equals(s2)); // flase
        System.out.println(s1.equals(s3)); // true
        // -----------------------------------------
        

    }
}
