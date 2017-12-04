package functional;

import java.util.ArrayList;

public class Attributes extends ArrayList {
    Attribute strength = new Attribute("STR");
    Attribute dexterity = new Attribute("DEX");
    Attribute intelligence = new Attribute("INT");
    Attribute wisdom = new Attribute("WIS");
    Attribute constitution = new Attribute("CON");
    Attribute charisma = new Attribute("CHA");

    Attributes() {
        this.add(strength);
        this.add(dexterity);
        this.add(intelligence);
        this.add(wisdom);
        this.add(constitution);
        this.add(charisma);
    }

    public void createModifiers() {
        this.strength.createModifier();
        this.dexterity.createModifier();
        this.constitution.createModifier();
        this.wisdom.createModifier();
        this.intelligence.createModifier();
        this.charisma.createModifier();
    }

    public int modifiersSum() {
        return strength.getModifier() + dexterity.getModifier() + constitution.getModifier() +
                intelligence.getModifier() + wisdom.getModifier() + charisma.getModifier();
    }

    @Override
    public String toString() {
        return "STR " + strength.count + " " + strength.getModifier() + "\n" + "DEX " + dexterity.count + " " + dexterity.getModifier() + "\n" + "CHA " + charisma.count + " " + charisma.getModifier() + "\n" + "INT " + intelligence.count + " " + intelligence.getModifier() + "\n" + "WIS " + wisdom.count + " " + wisdom.getModifier() + "\n" + "CON " + constitution.count + " " + constitution.getModifier() + "\n";
    }
}
