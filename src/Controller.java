import java.io.IOException;

public class Controller {
    private Character character = new Character();
    private Roller roller = new Roller(character);

    public Controller() throws IOException {
    }

    /**
     * create new character with filled fields
     */
    public void rollCharacter() {
        roller.rollClass();
        roller.rollAttributes();
        roller.rollHP();
        roller.setAB();
        roller.setSkills();
        roller.setSpells();
        roller.setSaves();
        roller.rollSex();
        roller.rollSilver();
        roller.rollEquipment();
        roller.setAC();
    }

    public Character getCharacter() {
        return character;
    }

    public void printCharacter() {
        System.out.println(character.toString());
    }

}
