// J10_Array.java
// Ctrl + B, Ctrl + Alt + B
// Command + B, Command + Option + B
// -------------------------------------------
public class J10_Array {
    public static void main(String[] args) {
        // 2차원 배열 -> Database -> 표 형태의 결과
        //  > 1차원 배열을 여러개 가짐!!!
        int[][] matrix = new int[3][4];
        System.out.println();
        System.out.println(matrix);
        System.out.println(matrix[0]);
        System.out.println(matrix[1]);
        System.out.println(matrix[2]);

        System.out.println(matrix[0][0]);
        System.out.println(matrix[0][1]);
        System.out.println(matrix[0][2]);
        System.out.println(matrix[0][3]);    
        
        System.out.println(matrix[1][0]);
        System.out.println(matrix[1][1]);
        System.out.println(matrix[1][2]);
        System.out.println(matrix[1][3]);  
        
        System.out.println(matrix[2][0]);
        System.out.println(matrix[2][1]);
        System.out.println(matrix[2][2]);
        System.out.println(matrix[2][3]);  

        // 0 1 2 3
        for(int i=0; i<4; i++){
            System.out.println(i);
        }

        // 0(0123) 1(0123) 2(0123)
        for(int i=0; i<matrix.length; i++){
            System.out.println("이럇호오");
            // 0 1 2 3
            for(int j=0; j<matrix[i].length; j++){
                //System.out.println(j);
                //System.out.printf("%d %d\n",i, j);
                System.out.println(matrix[i][j]);
            }
        }
        // ========================================
        int row=5, col=3;
        int[][] mat1 = new int[row][col];
        // 1부터 순서대로
        int c = 1;
        for(int i=0; i<row; i++){ // 0 1 2 3 4
            // 각 알바를 사용 가능
            System.out.println(mat1[i]);
            for(int j=0; j<col; j++){ // 0 1 2
                mat1[i][j] = c++;
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
        // ==========================================
        // 빠르게 돌아가면 안쪽, 느린게 바깥쪽
        row = 14; // 느리게
        col = 6;  // 빠르게
        int[][] mat2 = new int[14][6];
        // 1부터 순서대로
        c = 1;
        for(int i=0; i<row; i++){
            // 천천히 돌아가는 곳 -> 한 행 한 행 mat2[i]
            // 한 행마다 안쪽의 모든 공간에 숫자 대입
            for(int j=0; j<col; j++){
                // 빠르게 돌아가는 곳 -> 한행 중 하나의 열
                // 한명의 알바mat2[i]에게 col개의 데이터 대입[j]
                mat2[i][j] = c++ ;
            }
        }
        // 세팅 끝. 출력 시작
        for(int i=0; i<row; i++){
            System.out.println("----------------");
            for(int j=0; j<col; j++){
                System.out.print(mat2[i][j] + " " );
            }
            System.out.println();
        }
        // 1 2 3 4 5 6 
        // 7 8 9 10 11 12
        // 13 14 15 16 17 18
        // 19 ...
        // ----------------------------------------------
        row = 32;
        col = 10;
        c = 10;
        // 각 행에 순서대로 10부터 증가하는 숫자를 차례대로 넣고
        // 각 행마다 구분해서 모든 요소를 출력하세요 - mat3
        int[][] mat3 = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat3[i][j] = c++;
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
        // ============================================
        // 아래 이차배열을 모두 출력해라
        int[][] mat4 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] mat6 = {{1,2},{3,4},{5,6},{7,8},{9,10}};
        int[][] mat7 = {{1,2,3,4,5},{6,7,8,9,10}};
        // 아래 이차원배열에 모두 1부터 순서대로 넣고 순서대로 출력하기
        int[][] mat8  = new int[4][3];
        c=0;
        for(int i=0; i<4; i++){
            // i -> 0 1 2 3            // mat8[i][0,1,2]
            for(int j=0; j<3; j++){
                // j->0 1 2
                mat8[i][j] = ++c;
            }
        }
        int[][] mat9  = new int[5][2];
        int[][] mat10 = new int[2][5];
        int[][] mat11 = new int[15][12];

    }
}
