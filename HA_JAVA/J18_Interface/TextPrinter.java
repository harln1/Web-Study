package J18_Interface;

public class TextPrinter implements TextInterface {
    // -----------------------------------------
    // <필드>
    int currentPage;
    // LINES가 안보이지만 존재함(Implements를 하면 메소드는 구현해야하고
    // 필드는 가져오게 됨)
    // -----------------------------------------
    // <생성자>
    TextPrinter(){
        this.currentPage = 0;
    }
    // -----------------------------------------
    // <메소드>
    @Override
    public void PCurrent() {
        // LINES의 현재 줄 출력. 처음은 첫 줄에서 시작
        System.out.println(LINES[currentPage]);

    }

    @Override
    public void PNext() {
        // LINES의 다음 줄로 이동 후 출력 (5 다음은 5로)
        // LINES는 5개의 요소 배열 ( 0 1 2 3 4 )
        if(this.currentPage<LINES.length-1){
            System.out.println(LINES[++currentPage]);
        }else{ // currentPage가 4 5 6 ...
            System.out.println("다음 페이지는 없습니다. 마지막 장입니다.");
            System.out.println(LINES[currentPage]);
        }
    }

    @Override
    public void PPreview() {
        // LINES의 이전 줄로 이동 후 출력 (1 이전은 1로)
        if(this.currentPage>0){
            System.out.println(LINES[--currentPage]);
        }else{ // currentPage가 4 5 6 ...
            System.out.println("이전 페이지는 없습니다. 첫번째 장입니다.");
            System.out.println(LINES[currentPage]);
        }
    }

    @Override
    public void Reset() {
        // LINES의 첫 줄로 이동
        currentPage = 0;
    }

    @Override
    public void PAll() {
        // LINES의 전체 출력
        for(int i=0; i< LINES.length; i++){
            System.out.println(LINES[i]);
        }
    }
}
