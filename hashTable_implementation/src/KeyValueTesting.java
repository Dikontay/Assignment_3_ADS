import java.util.Hashtable;

public class KeyValueTesting {
    private int id;
    public String name;
    public KeyValueTesting(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public int hashCode(){
        return id*name.hashCode();
    }

}
