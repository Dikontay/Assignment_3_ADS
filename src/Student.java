public class Student {
    private int id;
    private String name;
    public Student(int id, String name){
        this.id=id;
        this.name=name;

    }
    @Override
    public int hashCode(){
        return id*name.hashCode()*31;
    }
}
