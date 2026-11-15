package HomeWork.Quize2;

import java.util.Random;

public class Utility {
    static String myName = "박하린";
    static int myPhone = 123456789;
    static int callCount;
//---------------------------------------------

    static void Introduce(){
        System.out.println(myName+" "+myPhone);
    }

    static int[] MakeArrayRandom(int size,int randomSize){
        int[] ary = new int[size];
        Random rand = new Random();

        for(int i=0;i<ary.length;i++){
            ary[i] = rand.nextInt(randomSize)+1;
        }
        callCount++;
        return ary;    
    }

    static void ReturnArrayCount(int[]ary,int findVale){
        int count = 0;
        for(int i=0;i<ary.length;i++){
            if(ary[i]==findVale){
                count++;
            }
        }
        System.out.println(count);
        callCount++;
    }


    static void PrintCallCount(){
        System.out.println(callCount);
    }
    
}
                                