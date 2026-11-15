package HomeWork.Lottoh;

import java.util.Random;

public class Lotto1 {
     
    // -------------------------------------
    int[][] lottoAry = new int[5][5];
    int[] winAry = {45, 5, 15, 25, 35};
    // -------------------------------------
    // 생성자 없음
    // -------------------------------------
    
    void SettingLotto(){ 
        
        Random randomGirl = new Random();
        
        for(int i = 0; i < 5; i++){
            System.out.print((i + 1) + " : ");
            
            for(int j = 0; j < 5; j++){
                lottoAry[i][j] = randomGirl.nextInt(45) + 1;
                
               
                for(int k = 0; k < j; k++){
                    if(lottoAry[i][j] == lottoAry[i][k]){
                        j--; 
                        break;
                    }
                }
            }
            
            for(int j = 0; j < 5; j++){
                System.out.print(lottoAry[i][j] + " ");
            }
            System.out.println();
        }
    }

    // < 당첨 판별 >
    void CheckWinner(){
        for(int i = 0; i < 5; i++){
            int cnt = 0;
          
            for(int winj = 0; winj < 5; winj++){
                for(int k = 0; k < 5; k++){
                    if(winAry[winj] == lottoAry[i][k]){
                        cnt++;
                        break;
                    }
                }
            }
         
            if(cnt == 0){
                System.out.println("꽝....");
            }else{
                System.out.println((6 - cnt) + "등 !! ㅊㅋㅊㅋ");
            }
        }
    }
}
