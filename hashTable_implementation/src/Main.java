import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       MyHashTable<String, Integer> hash = new MyHashTable<>();
       hash.put("Sabina", 45);
       hash.put("Sabin", 46);
       hash.put("Sabi", 47);
       hash.put("Sab", 48);
       hash.put("Sa", 49);
       hash.put("S", 50);
       printable(hash);
        System.out.println("-----------------------");
        System.out.println( hash.remove("Sab")+" This have to be removed");
        System.out.println("-----------");
        printable(hash);







    }
    public static void printable(MyHashTable hash){
        System.out.println(hash.get("S"));
        System.out.println("this is its index");
        System.out.println(hash.hash("S"));
        System.out.println("this is value");
        System.out.println(hash.get("Sa"));

        System.out.println("this is its index");
        System.out.println(hash.hash("Sa"));
        System.out.println("this is value");
        System.out.println(hash.get("Sab"));
        System.out.println("this is its index");
        System.out.println(hash.hash("Sab"));
        System.out.println("this is value");
        System.out.println(hash.get("Sabi"));
        System.out.println("this is its index");
        System.out.println(hash.hash("Sabi"));
        System.out.println("this is value");
        System.out.println(hash.get("Sabin"));
        System.out.println("this is its index");
        System.out.println(hash.hash("Sabin"));
        System.out.println("this is value");
        System.out.println(hash.get("Sabina"));
        System.out.println("this is its index");
        System.out.println(hash.hash("Sabina"));
    }
}