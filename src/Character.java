
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

    private int basicbonus, meleebonus, rangedbonus;



    private Skill opendoors = new Skill("opendoors");
    private Skill search = new Skill("search");
    private Skill stealth = new Skill("stealth");
    private Skill buchcraft = new Skill("buchcraft");
    private Skill languages = new Skill("languages");
    private Skill tinker = new Skill("tinker");
    private Skill architecture = new Skill("architecture");
    private Skill sof = new Skill("sleight of hand");
    private Skill climb = new Skill("climb");
    private Skill sneakattack = new Skill("sneakattack");

    boolean isMagic;

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

    public int getBasicbonus() {
        return basicbonus;
    }

    public void setBasicbonus(int basicbonus) {
        this.basicbonus = basicbonus;
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

    public void setSkills(int opendoors, int search, int stealth, int buchcraft, int languages, int tinker,
                          int architecture, int sof, int climb) {
        this.opendoors.count = opendoors;
        this.search.count = search;
        this.stealth.count = stealth;
        this.buchcraft.count = buchcraft;
        this.languages.count = languages;
        this.tinker.count = tinker;
        this.architecture.count = architecture;
        this.sof.count = sof;
        this.climb.count = climb;
    }

    public int getHp() {
        return       hp;
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

    public Skill getOpendoors() {
        return opendoors;
    }

    public void setOpendoors(int count) {
        this.opendoors.count = count;
    }

    public Skill getSearch() {
        return search;
    }

    public Skill getSneakattack() {
        return sneakattack;
    }

    public void setSneakattack(int count) {
        this.sneakattack.count = count;
    }

    public void setSearch(int count) {
        this.search.count = count;
    }

    public Skill getStealth() {
        return stealth;
    }

    public void setStealth(int count) {
        this.stealth.count = count;
    }

    public Skill getBuchcraft() {
        return buchcraft;
    }

    public void setBuchcraft(int buchcraft) {
        this.buchcraft.count = buchcraft;
    }

    public Skill getLanguages() {
        return languages;
    }

    public void setLanguages(Skill languages) {
        this.languages = languages;
    }

    public Skill getTinker() {
        return tinker;
    }

    public void setTinker(int count) {
        this.tinker.count = count;
    }

    public Skill getArchitecture() {
        return architecture;
    }

    public void setArchitecture(int count) {
        this.architecture.count = count;
    }

    public Skill getSof() {
        return sof;
    }

    public void setSof(int count) {
        this.sof.count = count;
    }

    public Skill getClimb() {
        return climb;
    }

    public void setClimb(int count) {
        this.climb.count = count;
    }

    public ArrayList getSpells() {
        return spells;
    }

    public void setSpells(ArrayList spells) {
        this.spells = spells;
    }

    String spellsToString() {
        if (this.isMagic)  {
            String strings = "";
            for (Object spell :
                    spells) {
                strings += spell.toString();
            }
            return "Spells:\n" + strings;
        }
        else
            return " ";
    }

    String skillsToString() {
        String skills = opendoors.toString() + search.toString() + stealth.toString() + buchcraft.toString() +
                languages.toString() + tinker.toString() + architecture.toString() + sof.toString() + climb.toString();
        if (this.pClass.equals("Specialist")) {
            skills = skills + sneakattack.toString();
        }
        return skills;
    }

    String savesToString() {
        return paralyzation.toString() + poison.toString() + breathweapon.toString() + magicaldevices.toString() + magic.toString();
    }

    String ABToString() {
        return "AB:" + basicbonus + "/" + meleebonus + "/" + rangedbonus;
    }

    @Override
    public String toString() {
        String result =  this.pClass + "\n" + this.attributes.toString() + "\n HP: " + this.hp + "\n" + savesToString() +
                "\n" + ABToString() + "\n" + skillsToString() + "\n" + spellsToString();
        return result;
    }
}