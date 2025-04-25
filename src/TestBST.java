public class TestBST {
    public static void main(String[] args) {
        BST<Integer, String> tree = new BST<>();

        tree.put(5, "Apple");
        tree.put(3, "Banana");
        tree.put(7, "Cherry");

        String value = tree.get(3);
        System.out.println("Value with key 3: " + value);

        System.out.println("Size of tree: " + tree.size());

        System.out.println("\nAll elements:");
        for (var entry : tree) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        tree.delete(3);
        System.out.println("\nAfter deleting key 3:");
        for (var entry : tree) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("Size of tree: " + tree.size());
    }
}