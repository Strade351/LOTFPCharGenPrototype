public class Demo {
    public static void main(String[] args) {
        Character character = new Character();
        Roller roller = new Roller(character);
        roller.rollClass();
        roller.rollSex();
        roller.rollAttributes();
        roller.rollHP();
        roller.setSaves();
        character = roller.getCharacter();
        System.out.println(character.toString());
    }
}
