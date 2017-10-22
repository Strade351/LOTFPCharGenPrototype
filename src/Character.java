
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



    private Saves saves;

    private int silver;

    Character() {

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

    public Saves getSaves() {
        return saves;
    }

    public void setSaves(Saves saves) {
        this.saves = saves;
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

    @Override
    public String toString() {
        String result =  this.pClass + "\n" + this.attributes.toString() + "\n HP: " + this.hp;
        return result;
    }
}
