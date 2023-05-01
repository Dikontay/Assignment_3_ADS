import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
       Random random=new Random();
       MyHashTable<KeyValueTesting, Student> hash = new MyHashTable<>();
      for(int i =0;i<10000; i++ ){
          KeyValueTesting k = new KeyValueTesting(random.nextInt(10000), "nameOfTest"+i);
          Student s = new Student(random.nextInt(10000), "Studentka"+i);
          hash.put(k,s);

      }
        System.out.println(hash.size());
        System.out.println(Arrays.toString(hash.printBucketsSize()));






    }

}