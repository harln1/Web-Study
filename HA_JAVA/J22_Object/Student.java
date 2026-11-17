package J22_Object;
public class Student {

     //--------------------------------------------
     //필드
    
     String name;
     int studentID;
     static int idCnt = 1000;
     //----------------------------------------------
     //생성자
     Student(String name){

        this.studentID = idCnt++;
        this.name = name;
       
     }

     //---------------------------------------------------
     //메소드
     
     @Override
     public String toString() {
         String result= "Name: "+name +"ID: "+studentID;
         return  result;
     }
     @Override
     public boolean equals(Object obj) {
         if(obj instanceof Student){
            if(this.studentID == ((student)obj).studentID){
                return true;
            }else{
                return false;
            }
         }else{
            return false;
         }
     }
     @Override
     public int hashCode() {
        return Object.hase(this.studentID);
         
     }
}