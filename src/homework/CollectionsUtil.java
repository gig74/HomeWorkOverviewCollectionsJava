package homework;

import java.util.*;

public class CollectionsUtil {
    /**
     * Меняет ключи и значения в HashMap<Integer,String> местами
     * @param inHashMap
     * @return
     */
    public static HashMap<String,Integer> reverseIntegerStringHashMap(HashMap<Integer,String> inHashMap) {
        HashMap<String,Integer> resultHashMap = new HashMap<>();
        for (Map.Entry<Integer,String> inMap: inHashMap.entrySet()) {
            resultHashMap.put(inMap.getValue(),inMap.getKey());
        }
        return resultHashMap;
    }

    /**
     * Метод заполнения двух List<Integer> миллионом одинаковых случайных значений от 1 до 9999
     * @param list1
     * @param list2
     */
    public static void twoListWithMillionRandomIntegerRows(List<Integer> list1, List<Integer> list2) {
        list1.clear();
        list2.clear();
        for (int i = 0; i < 1000000; i++) {
            int randomValue = 1 + (int)( Math.random() * 9999 ) ; // 1...9999
            list1.add(randomValue);
            list2.add(randomValue);
        }
    }

    /**
     * Метод , удаляющий из входного ArrayList<String> дублирующие значения
     * @param stringList
     */
    public static void distinctList(List<String> stringList) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.addAll(stringList);
        stringList.clear();
        stringList.addAll(hashSet);
    }
}
