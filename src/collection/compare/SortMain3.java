package collection.compare;

import java.util.Arrays;

public class SortMain3 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        MyUser[] arry = {myUser1, myUser2, myUser3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(arry));

        System.out.println("Compareable 기본 정렬");
        Arrays.sort(arry);
        System.out.println(Arrays.toString(arry));

        //추가
        System.out.println("IdComparator 정렬");
        Arrays.sort(arry, new IdComparator());
        System.out.println(Arrays.toString(arry));

        System.out.println("IdComparator().reversed() 정렬");
        Arrays.sort(arry, new IdComparator().reversed());
        System.out.println(Arrays.toString(arry));

    }
}
