public class Skill {
    String name;
    int count;
    Skill(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + count + "\n";
    }
}
