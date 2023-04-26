public class MyHashTable <K, V>{

    private  class HashNode<K,V>{
        private K key;
        private V value;
        private HashNode<K,V> next;
        public HashNode(){


        }

        public HashNode(K key,V value){
            this.key = key;
            this.value = value;
        }



    }
    private int M = 11;
    private HashNode[] chainArray;

    private int size ;

     public int hash(K key){
        return Math.abs(key.hashCode())%chainArray.length;
    }
    public MyHashTable(){
        chainArray = new HashNode[M];
    }

    public MyHashTable(int M){
        this.M = M;


    }
    public void put(K key, V value){
        HashNode<K,V> hashNode = new HashNode<K,V>(key,value);

        int indexInBucket = hash(key);

        if(chainArray[indexInBucket]==null){
            chainArray[indexInBucket] = hashNode;
            return;
        }
        HashNode<K,V> temp= chainArray[indexInBucket];
        while(temp.next!=null){
            if(temp.key.equals(key)){
                temp.value=value;
                return;
            }
            temp=temp.next;
        }
        temp.next=hashNode;
        size++;

       return;


    }
    public V get(K key){
        int index = hash(key);
        HashNode<K, V> temp = chainArray[index];

        while(temp!=null){
            if(temp.key.equals(key)){
                return temp.value;
            }
            temp = temp.next;
        }
       return null;
    }

    public V remove(K key){
         int index = hash(key);
         HashNode<K,V> temp = chainArray[index];
         if(chainArray[index].key.equals(key)){
             temp.next = chainArray[index].next;
             return  temp.value;
         }







        return (V) temp.next.value;
    }
    public boolean contains(){

        return false;
    }
    public K getKey(V value){
       for(int i =0; i<chainArray.length; i++){

       }
        return null;
    }

}
