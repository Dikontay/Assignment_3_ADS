public class MyHashTable {
    private class HashNode<K,V>{
        private K key;
        private V value;
        public HashNode(){


        }

        public HashNode(K key,V value){
            this.key= key;
            this.value= value;

        }


    }
    private HashNode [] chainArray;
    private int M = 11;
    private int size;

    public static int hash(String s){
        int hashCode= 0;
        for(int i =0; i<s.length(); i++){
            hashCode+=s.charAt(i);
            hashCode *= s.charAt(i);
        }
        hashCode%=s.length();
        return hashCode;
    }



}
