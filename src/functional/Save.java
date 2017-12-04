package functional;

/**
 * Created by Anatoliy on 23.10.2017.
 */
public class Save {
    String name;
    private int count;

    Save(String name) {
        this.name = name;
    }

    Save(String name, int count) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return name + " " + count + "\n";
    }
}
