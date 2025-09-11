package collection.array;

import java.util.Arrays;

public class ArrayMain2 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));
//배열의 첫번째 위치에 추가
//기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 첫번째 위치에 추가
        System.out.println("배열의 첫번째 위치에 3 추가 O(n)");
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));
//index 위치에 추가
//기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 index 위치에 추가
        System.out.println("배열의 index(2) 위치에 4 추가 O(n)");
        int index = 2;
        int value = 4;
        addAtIndex(arr, index, value);
        System.out.println(Arrays.toString(arr));
        System.out.println("배열의 마지막 위치에 5 추가 O(1)");
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));
    }
    private static void addLast(int[] arr, int newValue) {
        arr[arr.length - 1] = newValue;
    }
    private static void addFirst(int[] arr, int newValue) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = newValue;
    }
    private static void addAtIndex(int[] arr, int index, int newValue) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = newValue;

        /**
         *
         * 배열의 경우 다음 2가지 불편함이 있다.
         * 배열의 길이를 동적으로 변경할 수 없다.
         * 데이터를 추가하기 불편하다.
         * 데이터를 추가하는 경우 직접 오른쪽으로 한 칸씩 데이터를 밀어야 한다. (이런 코드를 직접 작성해야 한다.)
         * 배열의 이런 불편함을 해소하고 동적으로 데이터를 추가할 수 있는 자료 구조를 List(리스트)라 한다.
         * **List 자료 구조**
         * 순서가 있고, 중복을 허용하는 자료 구조를 리스트라 한다.
         * 일반적으로 배열과 리스트는 구분해서 이야기한다. 리스트는 배열보다 유연한 자료 구조로, 크기가 동적으로 변할 수 있
         * 다.
         * **배열**: 순서가 있고 중복을 허용하지만 크기가 정적으로 고정된다.
         * **리스트**: 순서가 있고 중복을 허용하지만 크기가 동적으로 변할 수 있다.
         *
         *
         */
    }
}
