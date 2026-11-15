package HomeWork.Quize2;

public class PU {
    static void Enter(){
        System.out.println("===================================");
    }
    static void Enter(int x){
        System.out.println("------------------------------------");
    }
    static  void  P(int x){
        System.out.println(x);
    }
    static void P(double x){
        System.out.println(x);
    }
    static void P(String x){
        System.out.println(x);
    }
    static void P(String[] s){
        for(int i=0;i<s.length;i++)
            System.out.println(s[i]);
    }
    static void P(int[] ary){
        for(int i=0;i<ary.length;i++){
            System.out.print(ary[i]+" "); 
        }
       System.out.println();
    }
}
