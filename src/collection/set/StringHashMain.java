package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int) charA);
        System.out.println("charB = " + (int) charB);

        //hashCode
        System.out.println("hashCode('A')" + hashcode("A"));
        System.out.println("hashCode('B')" + hashcode("B"));
        System.out.println("hashCode('AB')" + hashcode("AB"));

        //hashIndex
        System.out.println("hashIndex(A) = " + hashIndex(hashcode("A")));
        System.out.println("hashIndex(A) = " + hashIndex(hashcode("B")));
        System.out.println("hashIndex(A) = " + hashIndex(hashcode("AB")));
    }

    static int hashcode(String str) {
        char[] charArray = str.toString().toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum = sum + (int) c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;

    }
}
