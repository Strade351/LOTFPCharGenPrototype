import java.lang.reflect.Array;
import java.util.List;

public class Equipment {

    /*reflection fields that gson fills*/
    String name;                                                //name of current equipment pack
    int ac;
    String [] armor;
    String [] weapons;
    String [] misc;
    int cost;

    @Override
    public String toString() {
        return name + " " + ac + " " + armor[0] + " " + weapons[0] + " " + cost;
    }
}
