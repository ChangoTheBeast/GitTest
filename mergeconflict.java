public class MergeConflict {

    public static void main(String[] args) {

        System.out.println("test");
    }

    public static void merge() {
<<<<<<< HEAD
        List<Integer> testArray = new ArrayList<>();
        testArray.add(1)
=======
        List<String> testArray = new ArrayList<>();
        testArray.add("Hi")
>>>>>>> master
    }
}