package functional;

import java.lang.reflect.Array;
import java.util.List;

public class Equipment {

    /*reflection fields that gson fills*/
    String name;                                                //name of current equipment pack
    int ac;
    String [] armor;
    String [] weapons;
    String [] miscs;
    int cost;

    /**
     * forming a string of arrays content for toString()
     * @return
     */
    private String arraysContents() {
        String result = "";                              //final string
        for (String str: armor) {
            result += str + " ";
        }
        result += " ";
        for (String str: weapons) {
            result += str + " ";
        }
        result += " ";
        for (String str: miscs) {
            result += str + " ";
        }
        return result;
    }

    @Override
    public String toString() {
        return "\n" + arraysContents();
    }
}
