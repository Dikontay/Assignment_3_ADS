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
    private int numberOfBuckets = 11;
    private int size = 0;
    private HashNode[] chainArray;
    private double load_factor = 0.7;



     public int hash(K key){
        return Math.abs(key.hashCode())%chainArray.length;
    }
    public MyHashTable(){
        chainArray = new HashNode[numberOfBuckets];
    }

    public MyHashTable(int M){
        this.numberOfBuckets = M;


    }
    public void put(K key, V value){
         if(load_factor<size/(numberOfBuckets*1.0)){
             resize();
         }

        HashNode<K,V> hashNode = new HashNode<K,V>(key,value);

        int indexInBucket = hash(key);
        size++;
        if(chainArray[indexInBucket]==null){

            chainArray[indexInBucket] = hashNode;
            return;
        }
        HashNode<K,V> temp= chainArray[indexInBucket];
        HashNode<K,V> head= chainArray[indexInBucket];
        while(temp!=null){
            if(temp.key.equals(key)){
                temp.value=value;

                return;
            }
            temp=temp.next;
        }

        chainArray[indexInBucket] = hashNode;
        hashNode.next=head;
//        temp.next=hashNode;


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
         V removed = null;

         if(chainArray[index].key.equals(key)){

             removed = (V) chainArray[index].value;
             chainArray[index] = null;

         }else{
             HashNode<K,V> temp = chainArray[index];
             while(!temp.key.equals(key)){
                 temp = temp.next;
             }
             temp=temp.next.next;
             removed = temp.next.value;
             temp.next = null;


         }
         size--;
        return removed;
     }
    public boolean contains(V value){
        for(int i =0; i<chainArray.length; i++){
            for(HashNode temp = chainArray[i]; temp!=null; temp=temp.next){
                if(temp.value.equals(value)){
                    return true;
                }
            }
        }
        return false;
    }
    public K getKey(V value){
         for(int i =0; i<chainArray.length; i++){
             for(HashNode t = chainArray[i];t!=null; t=t.next){
                 if(t.value.equals(value)){
                     return (K) t.key;
                 }
             }
         }
        return null;
    }
    private void resize(){
         int biggerSize= findNearestBiggerPrime(numberOfBuckets*2);
        HashNode[] newArr = new HashNode[biggerSize];

        for (int i = 0; i < chainArray.length; i++) {
            newArr[i] = chainArray[i];
        }

        chainArray = newArr;
    }
    private static int findNearestBiggerPrime(int number) {
        while (true) {
            if (isPrime(number)) {
                return number;
            }
            number++;
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int size(){
         return size;
    }
    public int [] printBucketsSize(){
         int [] bucketsSize = new int[chainArray.length];

         for(int i =0; i<chainArray.length; i++){
             HashNode<K,V> head = chainArray[i];
             while(head!=null){
                 bucketsSize[i]++;
                 head=head.next;
             }
         }
        return bucketsSize;
    }



}
