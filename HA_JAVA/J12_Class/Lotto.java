// Lotto.java
package J12_Class;

import java.util.Random;

public class Lotto {
    // 5개가 한 쌍
    // -------------------------------------
    int[][] lottoAry = new int[5][5];
    int[] winAry = {45,5,15,25,35};
    // -------------------------------------
    // 생성자 없음
    // -------------------------------------
    // < 로또 생성 >
    void SettingLotto(){ // <생성자>
        // 5x5 랜덤값 1~45
        Random randomGirl = new Random();
        for(int i=0; i<5; i++){
            System.out.print( (i+1)+" : " );
            for(int j=0; j<5; j++){
                lottoAry[i][j] =(randomGirl.nextInt(45)+1);
                System.out.print(lottoAry[i][j] + " ");
            }
            System.out.println();
        }
    }

    // < 당첨 판별 >
    void CheckWinner(){
        // 당첨코드는 1차원 배열
        // 5줄이 있는데, 1줄씩 검사
        // 일치하는 숫자가 발생할 때마다 5 4 3 2 1 등으로 가야함
        for(int i=0; i<5; i++){
            int cnt = 0;
            // 로또의 각 줄을 구현 -> lottoAry[i][4]
            // win 0 -> lottoAryi0 i1 i2 i3 i4
            // win 1 -> lottoAryi0 i1 i2 i3 i4
            for(int winj = 0; winj<5; winj++){
                // winj -> 당첨번호를 하나씩 차례대로 순회
                // 당첨번호 하나당 한줄 긁어서 일치하는 개수 구해야함
                for(int k = 0; k<5; k++){
                    if(winAry[winj] == lottoAry[i][k]){
                        cnt++;
                        break;
                    }
                }
            }
            // ------------------------------
            // CNT 개수에 따른 등수 판별
            // 0 1 2 3 4 5
            // X 5 4 3 2 1
            if(cnt==0){
                System.out.println("꽝....");
            }else{
                System.out.println( (6-cnt) + "등 !! ㅊㅋㅊㅋ");
            }
        }

    }
}
