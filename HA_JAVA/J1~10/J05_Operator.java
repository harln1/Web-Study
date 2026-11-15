public class J05_Operator {
    public static void main(String[] args) {
        // < 연산자 >
        int x = 10, y = 4;
        // 산술연산자
        // + - * / %
        // 숫자1 % 숫자2 -> 숫자1을 숫자2로 나눈 나머지
        System.out.println(x%2); // 0이면짝, 아님 홀수
        // ----------------------------
        // 증감연산자 ★
        // x에 있는 원본을 1 증가
        x = x + 1;
        x++; // 뒤에붙은 ++ -- 모든게 끝나고 맨 마지막 실행
        ++x; // 일단 원본 증가 또는 감소 시켜~
        System.out.println(x); // 13
        System.out.println(++x); // 14
        System.out.println(x++); // 14
        System.out.println(x); // 15
        // x = 15, y = 4
        int z = x++ + ++y;
        System.out.println(z+--x- --y);
        // -----------------------------
        // 대입 연산자
        x = 10; // 덮어쓰기에
        y = 4;
        // x에 20을, y에 5를 누적 더하기
        x = x + 20; // x += 20;
        x += 20;
        // int abcdefgqwer12345 = 10;
        int productIdCompareInt = 10;
        productIdCompareInt = productIdCompareInt + 20 ;
        productIdCompareInt += 20;

        x -= 20; // x = x - 20;
        x *= 2 ; // x = x * 2;
        x %= 2 ; // x = x % 2;
        // --------------------------------
        // < 비교연산자 > - true / false -> 조건문,반복문
        // A==B  A와 B가 같으면 true, false
        // A!=B  A와 B가 다르면 true, flase
        // A>=B  A가 B보다 이상이면 true
        // A<=B  A가 B보다 이하면 true
        // A> B  A가 B보다 크면 true
        // A< B  A가 B보다 작으면 true
        // ★ ± × ≠ ≤ ≥ 이런거 절대 못 씀 ★
        int 옆집수학점수 = 100;
        int 내수학점수 = 80;
        System.out.println(옆집수학점수>=내수학점수);

        int tong = 8000;
        int SoonDae = 11000;
        int Jay6 = 10000;
        int bong9Suuu = 2500;
        // 내통장잔고가 메뉴보다 크거나 같으면 먹을수 있음!!
        boolean result1 = tong >= SoonDae;
        boolean result2 = tong >= Jay6;
        boolean result3 = tong >= bong9Suuu;
        System.out.printf("%b %b %b\n",result1,result2,result3);

        // < 삼항연산자 >
        // 조건식 ? true인경우 : false인경우
        // 조건식은 true, false가 나오는 비교식
        String r1 = tong>=SoonDae ? "순대국밥" : "굶어라";
        String r2 = tong>=Jay6 ? "제육볶음" : "굶어라";
        String r3 = tong>=bong9Suuu ? "봉구스" : "굶어라";
        System.out.printf("%s %s %s", r1, r2, r3);
        
    }
}
