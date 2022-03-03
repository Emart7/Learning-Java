package Curso4.conceptos;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> stringList = new java.util.ArrayList<>();
        stringList.add("The Big Bang Theory");
        stringList.add("Vikings");
        stringList.add("Friends");

        System.out.println(stringList);

        stringList.remove("Friends");

        System.out.println(stringList);

        boolean containsViking = stringList.contains("The Big Bang Theory");

        System.out.println("Contains vikings?: " + containsViking);

        int size = stringList.size();

        System.out.println(size);
    }
}
