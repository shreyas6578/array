import java.util.*;

public class DataStructureDemo {
    public static void main(String[] args) {
        // Array
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println("Array: " + Arrays.toString(numbers));

        // ArrayList
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Alice");
        namesList.add("Bob");
        System.out.println("ArrayList: " + namesList);

        // LinkedList
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Alice");
        namesLinkedList.add("Bob");
        System.out.println("LinkedList: " + namesLinkedList);

        // HashMap
        HashMap<String, Integer> agesMap = new HashMap<>();
        agesMap.put("Alice", 30);
        agesMap.put("Bob", 25);
        System.out.println("HashMap: " + agesMap);

        // HashSet
        HashSet<String> uniqueNamesSet = new HashSet<>();
        uniqueNamesSet.add("Alice");
        uniqueNamesSet.add("Bob");
        uniqueNamesSet.add("Alice"); // Duplicate, will not be added
        System.out.println("HashSet: " + uniqueNamesSet);

        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        int top = stack.pop(); // Removes and returns the top element
        System.out.println("Stack: " + stack + ", Popped element: " + top);

        // Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        int front = queue.poll(); // Removes and returns the front element
        System.out.println("Queue: " + queue + ", Polled element: " + front);

        // PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(30);
        priorityQueue.add(20);
        int smallest = priorityQueue.poll(); // Removes and returns the smallest element
        System.out.println("PriorityQueue: " + priorityQueue + ", Polled smallest element: " + smallest);

        // TreeMap
        TreeMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Alice", 30);
        sortedMap.put("Bob", 25);
        System.out.println("TreeMap: " + sortedMap);

        // TreeSet
        TreeSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Alice");
        sortedSet.add("Bob");
        System.out.println("TreeSet: " + sortedSet);
    }
}
