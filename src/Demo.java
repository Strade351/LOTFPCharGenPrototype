import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        Character character = new Character();
        Roller roller = new Roller(character);
        roller.rollClass();
        roller.rollSex();
        roller.rollAttributes();
        roller.rollHP();
        roller.setSaves();
        roller.setAB();
        roller.setSkills();
        roller.setSpells();
        roller.rollSilver();
        roller.rollEquipment();
        roller.setAC();
        character = roller.getCharacter();
        System.out.println(character.toString());
        ConfigReader configReader = new ConfigReader();
    }
}
