package collection.set;

import collection.set.member.Member;

public class MyHashSetV2Main2 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member hi = new Member("h1");
        Member jpa = new Member("JPA");
        Member java = new Member("java");
        Member spring = new Member("spring");

        System.out.println("hi.hashcode " + hi.hashCode());
        System.out.println("jpa.hashcode " + jpa.hashCode());
        System.out.println("java.hashcode " + java.hashCode());
        System.out.println("spring.hashcode " + spring.hashCode());

        set.add(hi);
        set.add(jpa);
        set.add(java);
        set.add(spring);
        System.out.println(set);

        Member searchValue = new Member("JPA");
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") "+ result);
    }
}
