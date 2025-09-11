package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class EmptyListMain {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // 빈 불변 리스트 생성
        List<Object> list3 = Collections.emptyList();
        List<Integer> list4 = List.of();

        System.out.println("list3 = " + list3.getClass());
        System.out.println("list4 = " + list4.getClass());

        Integer[] arr = {1, 2, 3, 4, 5};

    }
}
