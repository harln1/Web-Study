package J13_Static;

public class Util {
    static int age = 33;
    static int cnt = 0;

    static void PrintHello(){
        cnt++;
        if(cnt>=10){
            System.out.println("그만좀불러");
        }else{
            System.out.println("안녕!");
        }
    }
}
