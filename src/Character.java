
import org.w3c.dom.Attr;

import java.util.ArrayList;
import java.util.Set;

/**
 * Created by velvetmoor on 19.10.2017.
 */

public class Character {
    String name;

    Classes classes;

    String pClass;

    Attributes attributes;

    private String sex;

    private int hp, ac;
    private int meleebonus, rangedbonus;

    private int opendoors, search, stealth, bushcraft, languages, tinker, architecture, sof, climb;

    private ArrayList spells;

    private Save paralyzation = new Save("paralyzation");
    private Save magicaldevices = new Save("magical devices");
    private Save poison = new Save("poison");
    private Save breathweapon = new Save("breath weapon");
    private Save magic = new Save("magic");

    private int silver;

    Character() {

    }

    public Save getParalyzation() {
        return paralyzation;
    }

    public void setParalyzation(Save paralyzation) {
        this.paralyzation = paralyzation;
    }

    public Save getMagicaldevices() {
        return magicaldevices;
    }

    public void setMagicaldevices(Save magicaldevices) {
        this.magicaldevices = magicaldevices;
    }

    public Save getPoison() {
        return poison;
    }

    public void setPoison(Save poison) {
        this.poison = poison;
    }

    public Save getBreathweapon() {
        return breathweapon;
    }

    public void setBreathweapon(Save breathweapon) {
        this.breathweapon = breathweapon;
    }

    public Save getMagic() {
        return magic;
    }

    public void setMagic(Save magic) {
        this.magic = magic;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Classes getClasses() {
        return this.classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setSaves(int paralyzation, int poison, int breathweapon, int magicaldevices, int magic) {
        this.poison.setCount(poison);
        this.magicaldevices.setCount(magicaldevices);
        this.paralyzation.setCount(paralyzation);
        this.breathweapon.setCount(breathweapon);
        this.magic.setCount(magic);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getMeleebonus() {
        return meleebonus;
    }

    public void setMeleebonus(int meleebonus) {
        this.meleebonus = meleebonus;
    }

    public int getRangedbonus() {
        return rangedbonus;
    }

    public void setRangedbonus(int rangedbonus) {
        this.rangedbonus = rangedbonus;
    }

    public int getSilver() {
        return silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }

    String savesToString() {
        return paralyzation.toString() + poison.toString() + breathweapon.toString() + magicaldevices.toString() + magic.toString();
    }

    @Override
    public String toString() {
        String result =  this.pClass + "\n" + this.attributes.toString() + "\n HP: " + this.hp + "\n" + savesToString();
        return result;
    }
}
