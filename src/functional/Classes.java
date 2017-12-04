package functional;

public enum Classes {
    MAGICUSER("Magic-User"), WARRIOR("Fighter"), SPECIALIST("Specialist"), CLIRIC("Cliric"), DWARF("Dwarf"),
    ELF("Elf"), HAFFLING("Halfling");

    private String name;

    Classes(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
