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

    public void setSaves() {
        switch (character.pClass) {
            case ("Fighter") : {
                character.setSaves(14, 12, 15, 13, 16);
            } break;
            case ("Cleric") : {
                character.setSaves(14, 11, 16, 12, 15);
            } break;
            case ("Magic-User") : {
                character.setSaves(13, 13, 16, 13, 14);
            } break;
            case ("Specialist") : {
                character.setSaves(14, 16, 15, 14, 14);
            } break;
            case ("Dwarf") : {
                character.setSaves(10, 8, 13, 9, 12);
            } break;
            case ("Elf") : {
                character.setSaves(13, 12, 15, 13, 15);
            } break;
            case ("Halfling") : {
                character.setSaves(10, 8, 13, 9, 12);
            } break;
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
        if (character.pClass.equals("Dwarf"))
            attributes.constitution.setModifier(attributes.constitution.getModifier() + 1);
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
                int result = dice.rollD10() + character.getAttributes().constitution.getModifier();
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

    public void setSkills() {
        character.setSkills(1 + character.getAttributes().strength.getModifier(), 1, 1,
                1, 1 + character.getAttributes().intelligence.getModifier(), 1, 1, 1, 1);
        character.setSneakattack(0);
        switch (character.pClass) {
            case ("Specialist") : {
                int ran = r.nextInt(7);
                switch (ran) {
                    case (0) : {
                        character.setStealth(character.getStealth().count + 2);
                        character.setSneakattack(2);
                    } break;
                    case 1 : {
                        character.setSearch(character.getSearch().count + 2);
                        character.setTinker(character.getTinker().count + 2);
                    } break;
                    case 2 : {
                        character.setClimb(character.getClimb().count + 2);
                        character.setOpendoors(character.getOpendoors().count + 1);
                        character.setSearch(character.getSearch().count + 1);
                    } break;
                    case 3 : {
                        character.setStealth(character.getStealth().count + 1);
                        character.setClimb(character.getClimb().count + 1);
                        character.setSearch(character.getSearch().count + 1);
                        character.setSneakattack(1);
                    } break;
                    case 4 : {
                        character.setSneakattack(3);
                        character.setStealth(character.getStealth().count + 1);
                    } break;
                    case 5 : {
                        character.setSearch(character.getSearch().count + 4);
                    } break;
                    case 6 : {
                        character.setTinker(character.getTinker().count + 4);
                    } break;
                    case 7 : {
                        character.setArchitecture(character.getArchitecture().count + 1);
                        character.setOpendoors(character.getOpendoors().count + 2);
                        character.setTinker(character.getTinker().count + 1);
                    } break;
                }
            } break;
            case ("Dwarf") : {
                character.setArchitecture(3);
            } break;
            case ("Elf") : {
                character.setSearch(2);
            } break;
            case ("Halfling") : {
                character.setStealth(5);
                character.setBuchcraft(3);
            } break;
        }
    }

    public void setAB() {
        if (character.pClass.equals("Fighter"))
            character.setBasicbonus(2);
        else {
            character.setBasicbonus(1);
        }
        character.setMeleebonus(character.getBasicbonus() + character.getAttributes().strength.getModifier());
        character.setRangedbonus(character.getBasicbonus() + character.getAttributes().dexterity.getModifier());
    }

    public Character getCharacter() {
        return this.character;
    }
}
