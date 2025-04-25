import java.util.Random;

public class TestHashTable {
    public static void main(String[] args) {
        int bucketCount = 20;
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>(bucketCount);
        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            int id = rand.nextInt(100000);
            String nameKey = "Key" + rand.nextInt(100000);
            String nameVal = "Student" + rand.nextInt(100000);
            int age = 18 + rand.nextInt(10);

            MyTestingClass key = new MyTestingClass(id, nameKey);
            Student value = new Student(nameVal, age);
            table.put(key, value);
        }

        System.out.println("Distribution of elements across buckets:");
        for (int i = 0; i < bucketCount; i++) {
            System.out.println("Bucket " + i + ": " + table.getBucketSize(i) + " elements");
        }
    }
}