public enum MagicUserSpells {
    DETECT_MAGIC("Detect Magic"), BOOKSPEAK("Bookspeak"), CHARM_PERSON("Charm Person"), COMPREHEND_LANGUAGES("Comprehend Languages"),
    ENLARGE("Enlarge"), FAERIE_FIRE("Faerie Fire"), FEATHER_FALL("Feather Fall"), FLOATING_DISC("Floating Disc"),
    HOLD_PORTAL("Hold Portal"), IDENTIFY("Identify"), LIGHT("Light"), MAGIC_AURA("Magic Aura"),
    MAGIC_MISSILE("Magic Missile"), MENDING("Mending"), MESSAGE("Message"), READ_MAGIC("Read Magic"),
    SHIELD("Shield"), SLEEP("Sleep"), SPIDER_CLIMB("Spider Climb"), SUMMON("Summon"), UNSEEN_SERVANT("Unseen Servant");

    String name;
    MagicUserSpells(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + "\n";
    }
}
