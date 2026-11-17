import java.util.Random;

public class J00_Random {
    public static void main(String[] args) {
        // < 랜덤 사용법 정리 >
        // 1. java.util.Random 임포트!;
        // 2. random객체 만들기
        //    Random r = new Random();
        // 3. r.nextInt(요기전까지) 숫자를 뽑아줌
        //    r.nextInt(10) => 0~9
        // 4. 최소값 조정하고 싶으면 값을 더할 것
        //    r.nextInt(10)+1 => 1~10
        Random rand = new Random();
        int v1 = rand.nextInt(5); // 0~4
        int v2 = rand.nextInt(5);
        int v3 = rand.nextInt(5);
        System.out.printf("%d %d %d\n",v1,v2,v3);

        // target = 10~20
        int v4 = rand.nextInt(11)+10;
        System.out.println(v4);
    }
}
/*
System.out.print("\033[H\033[2J");
System.out.flush();
*/
