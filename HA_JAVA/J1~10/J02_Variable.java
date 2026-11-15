public class J02_Variable {
    public static void main(String[] args){
        // 변수 = 저장공간, 잠깐 저장
        // < 자료형 >
        // int (Integer) 정수형
        // double (float의 2배) 실수형
        // boolean 논리형(true/false)
        // String 문자열
        // --------------------------------
        // < 변수 만드는법 (짱쉽다...!) >
        // 자료형 변수명 = 값;
        int age = 33;
        String name = "강대성";
        double kg = 1.0;
        System.out.println();
        System.out.println(age);
        System.out.println(name);
        System.out.println(kg); // F5
        // -----------------------------
        // < 얼박사 실습 >
        String productName = "얼박사";
        int price = 2300;
        double caffein = 0.1;
        System.out.println(productName);
        System.out.println(price);
        System.out.println(caffein);
        // ------------------------------
        // printf 사용방법!
        // %d 정수출력  %.?f 실수출력 %s 문자열출력
        System.out.printf("이름 : %s\n",productName);
        System.out.printf("가격 : %d\n",price);
        System.out.printf("필수영양소 : %.1f\n",caffein);

        // 변수 동시에 여러개만들기
        int a=1,b=2,c=3,d=4,e=5,f=6,g=7,h=8,i=9,j=10 ;
        System.out.printf("%d %d %d %d %d %d %d %d %d %d\n",
                            a, b, c, d, e, f, g, h, i, j);
        // --------------------------------------------
        // print시 + 하면 연결됨!! ( 문자와 문자는 연결 )
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j);

        // \..../\
        // .)..(.')
        // (../..)
        // .\(__)|
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");



    }
}
