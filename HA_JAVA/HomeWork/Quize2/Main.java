package HomeWork.Quize2;

public class Main {
    public static void main(String[] args) {

        //PU

        PU.Enter();
        PU.Enter(10);
        PU.P(10.0);
        PU.P("메롱");
        
        String[] chicken ={"후라이드","양념","뿌링클"};
        PU.P(chicken);

        int[] num = {10,11,12,13,333};
        PU.P(num);

        //--------------------------------------------------

        //Utility
        
        Utility.Introduce();

        int[] myAry = Utility.MakeArrayRandom(10, 5);
        Utility.ReturnArrayCount(myAry, 3);
        Utility.PrintCallCount();

        
        
    }
    
}
