public class Demo {
    public static void main(String[] args) {
        Character character = new Character();
        Roller roller = new Roller(character);
        roller.setClass();
        roller.rollAttributes();
        character = roller.getCharacter();
    }
}
