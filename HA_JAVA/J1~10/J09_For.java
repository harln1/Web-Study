// J09_For.java  2026-10-31

import java.util.Random;

public class J09_For {
    public static void main(String[] args) {
        // for 초기화->조건식->실행문->증감식->조건식 ...   
        // for(초기화; 조건식; 증감식){실행문}
        // ----------------------------------------
        // "자바가 좋아" 를 10번 외치십쇼
        // for(int i=1; i<=10; i++) 사람입장
        for(int i=0; i<10; i++){ // 컴퓨터입장
            // ★ Alt 위아래 위 위 아래
            System.out.println("자바가 조아!!!!");
        }
        // "스프링 쪼아!!" 를 x번 외치십쇼
        int x = 100;
        for(int i=0; i < x ; i++){// 유지보수 좋은 코드
            System.out.println("스프링 쪼아!!");
        }
        // 누적해서 통계 구하기
        // 개수, 합계, 평균, 최대값, 최소값
        int cnt = 0;
        int sum = 0;
        double avg = 0;
        int max = -99999;
        int min =  99999;
        //           0 1 2 3 4 5 6 7 8 9 10 11 Index
        int[] ary = {1,9,7,3,8,5,4,6,2,4,8, 9};
        for(int i=0; i<12; i++){
            cnt++; // cnt = cnt + 1 // cnt += 1
            sum += ary[i]; // sum = sum + ary[i];
            // 평균은 지금 못 구함...
            if(max<ary[i]){
                max = ary[i];
            }
            if(min>ary[i]){
                min = ary[i];
            }
        }
        // 평균 = 합계(sum)/개수(cnt) = 정/정
        // avg = sum/cnt;
        avg = (1.0*sum)/cnt;
        avg = (double)(sum)/cnt;
        // 출력하기
        System.out.println("합계 : " + sum);
        System.out.println("개수 : " + cnt);
        System.out.println("평균 : " + avg);
        System.out.println("최대 : " + max);
        System.out.println("최소 : " + min);

        // --------------------------------
        // 배열(객체) 만드는 방법!!!
        // 1. 수동  자료형[] 배열이름 = {}
        //int[] ary2 = {1,2,3,4,5};
        //String[] ary3 = {"내 사랑", "그대여","이제"};
        //double[] ary4 = {1.1, 2.34, 5.5, 6.6};
        // 2. 빈칸  자료형[] 배열이름 = new 자료형[x]
        int[] ary5 = new int[5]; // 5칸
        System.out.println(ary5[0]);
        System.out.println(ary5[1]);
        System.out.println(ary5[2]);
        System.out.println(ary5[3]);
        System.out.println(ary5[4]);
        // System.out.println(ary5[5]);
        Random 호스트강군 = new Random();
        
        for(int i=0; i<ary5.length; i++){
            ary5[i] = 호스트강군.nextInt(100)+1;
            System.out.println(ary5[i]);
        }
        // ================================
        // ===== 여기전까지 녹화 날라가감 =====
        // ================================
        // 녹화본으로 보시는분들은 보강영상 확인
        
        // 배열을 몇개 만들지를 y에 넣고
        // 그만큼 배열만들어서 모두 랜덤값 넣기
        int y = 1972;
        int start = 10, end = 99;
        // 10 19 -> 19-10 -> 9 +1 -> 10
        // 99-10 + 1
        int[] ary6 = new int[y];//0~1971
        for(int i=0; i<y; i++){
            ary6[i] = 호스트강군.nextInt(end-start+1)+start;
            System.out.printf("[%d] : %d\n",i,ary6[i]);
        }
        // -----------------------------------------
        // < 실습 1 >
        // 배열을 100개만들고, 1~100까지 랜덤숫자를 모두 넣고
        // 합계 개수, 평균 구해서 출력
        int[] ary7 = new int[100];
        // sum, avg, cnt는 위에서 이미 변수를 만들었음
        sum=0;        avg=0;        cnt=0;
        for(int i=0; i<ary7.length; i++){
            ary7[i] = 호스트강군.nextInt(100)+1;
            cnt += 1; // cnt++   ++cnt
            sum += ary7[i];
        }
        avg = (double)(sum)/cnt;
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);
        System.out.println("개수 : " + cnt);

        // --------------------------------------
        // < 실습 2 >
        // int z 에 숫자를 넣어주고 z만큼 아래를 반복
        // 3% 확률로 "당첨!"" 아니면 "꽝" 출력
        int z = 999;
        for(int i=0; i<z; i++){
            int k = 호스트강군.nextInt(100)+1; // 1~100
            if(k<=30){
                System.err.println("당첨!!");
                break;  // 지시는 없지만 당첨되면 끝으로 합시다
            }else{
                System.out.println("꽝");
            }
        }
        // -------------------------------------
        //{8, 14, 21, 36, 45, 63, 78}의 데이터를 배열에 저장 후,
        //  특정 숫자를 입력할 경우 해당 숫자가 배열에서 몇번째에 
        // 위치하는지 출력하세요. 만약 없을 경우 "X"를 출력하세요
        int flag=0; // 상태관리
        int[] ary8 = {8, 14, 21, 36, 45, 63, 78};
        //int target = 36;
        int target = 999;
        for(int i=0; i<ary8.length; i++){
            if(ary8[i] == target){
                System.out.println("위치 : "+i);
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println("X");
        }
        // -----------------------------------------
        System.out.print("\033[H\033[2J");
        System.out.flush();
        // 화면 비우기!

        String[] ani = new String[4];
        // 생각나는 영화 애니 이름 0~3번에 넣기
        ani[0] = "죠죠의 기묘한 모험 - 황금의 바람";
        ani[1] = "치이카와 인어 섬의 비밀";
        ani[2] = "헌터X헌터";
        ani[3] = "데스 노트";
        for(int i=0; i<ani.length; i++){
            System.out.println(ani[i]);
        }
        
    }
}
/*
< 쥐난시간 복습 >
1. 자바 개발환경 설정
2. 입출력 - While
3. while : 무한반복
while(조건식){
    실행코드
}
4. break : 강제탈출, continue 조건식 순간이동

*/
