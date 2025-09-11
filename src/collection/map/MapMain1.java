package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {
        //순서를 보장하지 않음
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        System.out.println(studentMap);

        //특정 학생의 값 조회
        Integer result = studentMap.get("studentD");
        System.out.println("result = " + result);

        System.out.println("KeySet 활용");
        Set<String> KeySet = studentMap.keySet();
        for (String Key : KeySet) {
            Integer value = studentMap.get(Key);
            System.out.println("key = " + Key + " Value = " + value);

        }

        System.out.println("entrySet 활용");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", values " + value);
        }
        System.out.println("value 활용");
        Collection<Integer> values = studentMap.values();
        for (Integer Value : values) {
            System.out.println("value = " + values);
        }
    }
}
