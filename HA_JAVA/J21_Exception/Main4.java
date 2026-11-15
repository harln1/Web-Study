package J21_Exception;
// 단, public붙는 class는 파일명과 일치, 딱 1개
class 타짜{
    void 쏠수있어() throws Exception{
        throw new Exception("쏠 수 있다니까!!");
    }
    @Override
    public String toString() {
        return "국내산 홍차엽 복숭아티";
    }
}

public class Main4 {
    public static void main(String[] args) {
        타짜 장마담 = new 타짜();
        try{
            장마담.쏠수있어();
        }catch(Exception e){
            System.out.println("난 딴 돈의 반만 가져가");
            System.out.println(e.getMessage());
        }




        Object k = new Object();
        System.out.println(장마담.getClass());
        // class J21_Exception.타짜
        System.out.println(장마담.hashCode());
        // 1421795058 -> C/C++ 포인터 개념을 대치
        System.out.println(장마담.toString());
        // J21_Exception.타짜@54bedef2
        System.out.println(장마담);
        // J21_Exception.타짜@54bedef2
    }
}
