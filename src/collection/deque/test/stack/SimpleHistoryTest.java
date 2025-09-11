package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleHistoryTest {
    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();

        stack.add("facebook.com");
        stack.add("google.com");
        stack.add("youtube.com");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

}
