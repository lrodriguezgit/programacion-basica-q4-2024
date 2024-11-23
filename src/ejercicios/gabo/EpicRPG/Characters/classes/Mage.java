package Characters.classes;

import Characters.Character;
import Characters.Skills.Skill;
import java.util.ArrayList;


public class Mage extends Character {


    //Constuctor mago

    public Mage() {
        super(200, 50, new ArrayList<Skill>());
        Skill test = new Skill("Basic Attack", "Pego un basico", "BASIC");
        Skill test2 = new Skill("Arcane Shield", "Absorb the next damage received", "BUFF");
        Skill test3 = new Skill("Fireball", "Attacks with a power of 90 points", "SP");
        this.AddSkill(test);
        this.AddSkill(test2);
        this.AddSkill(test3);
    }


    @Override
    public void normalAttack(Character target) {
        target.receiveDMG(this.Power);
    }

    @Override
    public void buffSkill() {
        Mage.this.activateBuff(1);
    }

    @Override
    public void specialSkill(Character target) {
        target.receiveDMG(90);
    }

    @Override
    public void receiveDMG(double DMG) {
        if (!this.buffEnable) {
            this.updateCurrentHP(getCurrentHP() - DMG);
            if (getCurrentHP() <=0) this.setDefeated();
        }
        else{
            this.deactivateBuff(0);
        }
    }

    @Override
    public void victory() {
        System.out.println("The Mage won! remaining HP = " + getCurrentHP());
    }

    @Override
    public String stringCurrentHP() {
        return "Mage HP =" + getCurrentHP();
    }
}
