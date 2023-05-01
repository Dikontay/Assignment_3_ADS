import java.util.Hashtable;

public class KeyValueTesting {
    private int id;
    private static int id_gen = 1;
    public String name;
    public KeyValueTesting(){
        id =  id_gen++;
    }
    public KeyValueTesting(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public int hashCode(){
        return id*name.hashCode()*31;
    }

}
