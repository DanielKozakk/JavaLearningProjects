package setset;

public class Addable {

    private String name;

    public Addable(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
       return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Addable){
            return name.equals(((Addable) obj).name);
        }
        return false;
    }
}
