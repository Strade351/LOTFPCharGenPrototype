import java.util.Random;

/**
 * Created by velvetmoor on 19.10.2017.
 */

public class Roller {
    Random r = new Random();
    Dice dice = new Dice();

    Character character;

    Roller(Character character) {
        this.character = character;
    }

    private Classes setClass() {
        switch (r.nextInt(7)) {
            case 0 : return Classes.WARRIOR;
            case 1 : return Classes.MAGICUSER;
            case 2 : return Classes.SPECIALIST;
            case 3 : return Classes.CLIRIC;
            case 4 : return Classes.DWARF;
            case 5 : return Classes.ELF;
            case 6 : return Classes.HAFFLING;
            default: return null;
        }
    }

    private Saves setSaves() {
        Saves saves = new Saves();
        switch (character.pClass) {
            case ("Fighter") : {
                saves.add(new Save("paralyze", 16));

            }
        }
    }

    public void rollClass() {
        character.pClass = setClass().toString();
        character.classes = setClass();
        character.attributes = rollAttributes();
    }

    public Attributes rollAttributes() {
        Attributes attributes = new Attributes();
        attributes.strength.count = dice.rollD6() + dice.rollD6() + dice.rollD6();
        attributes.dexterity.count = dice.rollD6() + dice.rollD6() + dice.rollD6();
        attributes.constitution.count = dice.rollD6() + dice.rollD6() + dice.rollD6();
        attributes.intelligence.count = dice.rollD6() + dice.rollD6() + dice.rollD6();
        attributes.wisdom.count = dice.rollD6() + dice.rollD6() + dice.rollD6();
        attributes.charisma.count = dice.rollD6() + dice.rollD6() + dice.rollD6();
        attributes.createModifiers();
        if (attributes.modifiersSum() >= 0) {
            return attributes;
        }
        return rollAttributes();
    }

    public void rollSex() {
        if (r.nextInt(1) == 1) {
            this.character.setSex("male");
        } else {
            this.character.setSex("female");
        }
    }

    public void rollHP() {
        switch (character.pClass) {
            case "Fighter": {
                int result = dice.rollD8() + character.getAttributes().constitution.getModifier();
                if (result > 8) {
                    character.setHp(result);
                } else character.setHp(8);

            } break;
            case "Elf": {
                int result = dice.rollD6() + character.getAttributes().constitution.getModifier();
                if (result > 4) {
                    character.setHp(result);
                } else character.setHp(4);

            } break;
            case "Dwarf": {
                int result = dice.rollD8() + character.getAttributes().constitution.getModifier();
                if (result > 6) {
                    character.setHp(result);
                } else character.setHp(6);
            } break;
            case "Cliric": {
                int result = dice.rollD6() + character.getAttributes().constitution.getModifier();
                if (result > 4) {
                    character.setHp(result);
                } else character.setHp(4);
            } break;
            case "Halfling": {
                int result = dice.rollD6() + character.getAttributes().constitution.getModifier();
                if (result > 4) {
                    character.setHp(result);
                } else character.setHp(4);
            } break;

            case "Magic-User": {
                int result = dice.rollD6() + character.getAttributes().constitution.getModifier();
                if (result > 3) {
                    character.setHp(result);
                } else character.setHp(3);
            } break;
            case "Specialist": {
                int result = dice.rollD6() + character.getAttributes().constitution.getModifier();
                if (result > 4) {
                    character.setHp(result);
                } else character.setHp(4);
            } break;
        }

    }

    public Character getCharacter() {
        return this.character;
    }
}
