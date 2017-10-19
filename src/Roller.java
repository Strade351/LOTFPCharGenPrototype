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
        this.setClass();
    }

    private Classes rollClass() {
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

    public void setClass() {
        this.character.classes = rollClass();
    }

    public void rollAttributes() {
        this.character.cha = dice.rollD6() + dice.rollD6() + dice.rollD6();
        this.character.wis = dice.rollD6() + dice.rollD6() + dice.rollD6();
        this.character.str = dice.rollD6() + dice.rollD6() + dice.rollD6();
        this.character.intel = dice.rollD6() + dice.rollD6() + dice.rollD6();
        this.character.dex = dice.rollD6() + dice.rollD6() + dice.rollD6();
        this.character.con = dice.rollD6() + dice.rollD6() + dice.rollD6();
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
            case WARRIOR: character.setHp(dice.rollD8());             //Не доделано
        }
    }


    public Character getCharacter() {
        return this.character;
    }
}
