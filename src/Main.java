import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    static void task4() {
        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));
        Map<String, Integer> words = new HashMap<String, Integer>();
        for (int i = 0; i < strings.size(); i++) {
            String tempWords = strings.get(i);
            if (!words.containsKey(tempWords)) {
                words.put(tempWords, 1);
            } else {
                words.put(tempWords, words.get(tempWords) + 1);
            }
        }
        for (Map.Entry<String, Integer> doubles : words.entrySet()) {
            System.out.println("Count of doubles the word: " + doubles.getKey() + " - " + (doubles.getValue() - 1));
        }
    }

    static void task3() {
        List<String> words = new ArrayList<>(List.of("one", "two", "three", "one", "three"));
        Set<String> words2 = new HashSet<>(words);
        words.clear();
        words.addAll(words2);
        System.out.println(words);
    }

    static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }

    static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> nums2 = new LinkedHashSet<>(nums); //Можно использовать LinkedHashSet для сохранения порядка.
        nums.clear();
        nums.addAll(nums2);
        Iterator<Integer> numsIterator = nums.iterator();
        while (numsIterator.hasNext()) {
            Integer num = numsIterator.next();
            if (num % 2 != 0) {
                numsIterator.remove();
            }
        }
        System.out.println(nums);
    }
}