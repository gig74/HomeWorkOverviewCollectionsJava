import homework.CollectionsUtil;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> testHashMap = new HashMap<>();
        testHashMap.put(1, "Один");
        testHashMap.put(2, "Два");
        testHashMap.put(4, "Четыре");
        HashMap<String, Integer> resultHashMap = CollectionsUtil.reverseIntegerStringHashMap(testHashMap);
        System.out.println("Задание 1");
        System.out.println("Входной HashMap: " + testHashMap);
        System.out.println("Результат HashMap: " + resultHashMap);

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        CollectionsUtil.twoListWithMillionRandomIntegerRows(arrayList, linkedList);

        System.out.println("Задание 2");
        System.out.println("Размер ArrayList: " + arrayList.size() + " занисей");
        System.out.println("Размер LinkedList: " + linkedList.size() + " занисей");
        int listSize = arrayList.size();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Integer result = arrayList.get((int) (Math.random() * listSize));
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Время выбора тысячи случайных элементов из ArrayList, мс: " + elapsed);

        listSize = linkedList.size();
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Integer result = linkedList.get((int) (Math.random() * listSize));
        }
        finish = System.currentTimeMillis();
        elapsed = finish - start;
        System.out.println("Время выбора тысячи случайных элементов из linkedList, мс: " + elapsed);

        ArrayList<String> testArrayList = new ArrayList<String>(Arrays.asList(new String[]{"один", "два", "три", "два", "четыре", "четыре"}));
        System.out.println("Задание 3");
        System.out.println("Входной ArrayList: " + testArrayList);
        CollectionsUtil.distinctList(testArrayList);
        System.out.println("Модифицированный ArrayList: " + testArrayList);
    }
}