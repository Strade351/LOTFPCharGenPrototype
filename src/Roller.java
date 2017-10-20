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

    public void rollClass() {
        this.character.classes = setClass();
    }

    public void rollAttributes() {
        character.getAttributes().strength.count = dice.rollD6() + dice.rollD6() + dice.rollD6();
        character.getAttributes().dexterity.count = dice.rollD6() + dice.rollD6() + dice.rollD6();
        character.getAttributes().constitution.count = dice.rollD6() + dice.rollD6() + dice.rollD6();
        character.getAttributes().intelligence.count = dice.rollD6() + dice.rollD6() + dice.rollD6();
        character.getAttributes().wisdom.count = dice.rollD6() + dice.rollD6() + dice.rollD6();
        character.getAttributes().charisma.count = dice.rollD6() + dice.rollD6() + dice.rollD6();
    }

    public void rollSex() {
        if (r.nextInt(1) == 1) {
            this.character.setSex("male");
        } else {
            this.character.setSex("female");
        }
    }

    public void rollHP() {
        switch (character.classes) {
            case WARRIOR: {
                if ((dice.rollD8() + character.getAttributes().constitution.getModifier()) > 8) {
                    character.setHp(dice.rollD8() + character.getAttributes().constitution.getModifier());
                }
                else character.setHp(8);
            }
            case ELF: {
                if ((dice.rollD6() + character.getAttributes().constitution.getModifier()) > 4) {
                    character.setHp(dice.rollD6()+ character.getAttributes().constitution.getModifier());
                }
                else character.setHp(4);
            }
            case DWARF: {
                if ((dice.rollD8() + character.getAttributes().constitution.getModifier() > 6)) {
                    character.setHp(dice.rollD8()+ character.getAttributes().constitution.getModifier());
                }
                else character.setHp(6);
            }
            case CLIRIC: {
                if (dice.rollD6()+ character.getAttributes().constitution.getModifier() > 4) {

                }
                else character.setHp(4);
            }
        }
    }

    public Character getCharacter() {
        return this.character;
    }
}
