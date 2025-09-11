package collection.link;

public class NodeMain3 {

    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        //모든 노트 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        //마지막 노드 조회하기
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        //특정 인덱스의 노트 조회 하기
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node);

        //데이터 추가하기
        System.out.println("데이터 추가 하기");
        add(first, "D");
        System.out.println(first);
    }



    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }
    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }
    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;

    }

    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }
/**
 * 우리는 앞서 배열을 통해서 리스트를 만들었는데 이것을 배열 리스트(`ArrayList` )라 한다.
 * 이번에는 배열이 아닌 앞서 학습한 노드와 연결 구조를 통해서 리스트를 만들어보자. 이런 자료 구조를 연결 리스트
 * (`LinkedList` )라 한다. 참고로 링크드 리스트, 연결 리스트라는 용어를 둘다 사용한다.
 * 연결 리스트는 배열 리스트의 단점인, 메모리 낭비, 중간 위치의 데이터 추가에 대한 성능 문제를 어느정도 극복할 수 있
 * 다.
 * **리스트 자료 구조**
 * 순서가 있고, 중복을 허용하는 자료 구조를 리스트(List)라 한다.
 * 우리는 앞서 `MyArrayList` 시리즈를 만들어보았다. 배열 리스트도, 연결 리스트도 모두 같은 리스트이다. 리스트의
 * 내부에서 배열을 사용하는가 아니면 노드와 연결 구조를 사용하는가의 차이가 있을 뿐이다.
 * 배열 리스트를 사용하든 연결 리스트를 사용하든 둘다 리스트 자료 구조이기 때문에 리스트를 사용하는 개발자 입장에
 * 서는 거의 비슷하게 느껴져야 한다. 쉽게 이야기해서 리스트를 사용하는 개발자 입장에서 `MyArrayList` 를 사용하든
 * `MyLinkedList` 를 사용하든 내부가 어떻게 돌아가지는 몰라도, 그냥 순서가 있고, 중복을 허용하는 자료 구조구나 생
 * 각하고 사용할 수 있어야 한다.
 */
}
