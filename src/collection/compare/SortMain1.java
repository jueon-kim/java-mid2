package collection.compare;

import java.util.Arrays;

public class SortMain1 {

    public static void main(String[] args) {
        Integer[] arry = {3, 2, 1};
        System.out.println(Arrays.toString(arry));

        System.out.println("기본 정렬후");
        Arrays.sort(arry);
        System.out.println(Arrays.toString(arry));

    }
}
