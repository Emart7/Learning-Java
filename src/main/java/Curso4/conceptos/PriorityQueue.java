package Curso4.conceptos;

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<String> stringQueue = new java.util.PriorityQueue<>();
        stringQueue.add("Pera");
        stringQueue.add("Manzana");
        stringQueue.add("Banano");
        stringQueue.add("Cereza");
        stringQueue.add("Mora");
        stringQueue.add("Lulo");
        System.out.println(stringQueue);

        String pollString = stringQueue.poll();
        System.out.println(pollString);
        System.out.println(stringQueue);
    }
}
