public enum CliricSpells {
    BLESS("Bless"), COMMAND("Command"), CURE_LIGHT_WOUNDS("Cure Light Wounds"), DETECT_EVIL("Detect Evil"),
    INVISIBILITY_TO_UNDEAD("Invisibility to Undead"), PROTECTION_FROM_EVIL("Protection from Evil"),
    PURIFY_FOOD_AND_DRINK("Purify Food & Drink"), REMOVE_FEAR("Remove Fear"), SANCTUARY("Sanctuary"),
    TURN_UNDEAD("Turn Undead");

    String name;

    CliricSpells(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + "\n";
    }
}
