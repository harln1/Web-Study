package J17_ObjectArray.Quiz3;

public class Main {
    public static void main(String[] args) {
        // 여러분 친구들 중 3명정도를 Person클래스를 이용해서 2명,
        //  FriendPerson 2명 FriendList에 추가하세요.
        //   ( Person으로 배열 만들기 )
        Person[] friendList = new Person[4];
        friendList[0] = new Person("서연");
        friendList[1] = new Person("초희", 34);
        friendList[2] = new FriendPerson("민관", 29, "닭가슴살 싫어하는데 운동해야해서 먹음" );
        friendList[3] = new FriendPerson("한결", 30, "여친사귄적 없으면서 여자 잘 아는 척 함");
                
        // 모든 객체의 Introduce를 실행
        for(int i=0; i<friendList.length; i++){
            friendList[i].Introduce();
            System.out.println("-------");
        }
    }
}
