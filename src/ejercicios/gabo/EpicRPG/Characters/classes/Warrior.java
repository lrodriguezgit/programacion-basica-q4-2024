package Characters.classes;
import Characters.Character;
import Characters.Skills.Skill;

import java.util.ArrayList;

public class Warrior extends Character{
    public Warrior (){
        super(260,40, new ArrayList<Skill>());
        Skill skill1 = new Skill("Basic attack", "basic attack", "BASIC");
        Skill skill2 = new Skill("Iron Skin", "Reduce damage of the next attack received in 50% and regenerate your health by 40 points", "BUFF");
        Skill skill3 = new Skill("Blade Storm", "Attacks with a power of 75 points","SP");
        this.AddSkill(skill1);
        this.AddSkill(skill2);
        this.AddSkill(skill3);
    }

    @Override
    public void normalAttack(Character target) {
        target.receiveDMG(this.Power);
    }

    @Override
    public void buffSkill() {
        this.activateBuff(1);
        updateCurrentHP(getCurrentHP() + 40);
        if (getCurrentHP() > this.HP) updateCurrentHP(this.HP);
    }

    @Override
    public void specialSkill(Character target) {
        target.receiveDMG(75);
    }

    @Override
    public void receiveDMG(double DMG) {
        if (!buffEnable){
            updateCurrentHP(getCurrentHP() - DMG);
            if (getCurrentHP() <=0) setDefeated();
        }
        else{
            updateCurrentHP(getCurrentHP() - (DMG/2));
            deactivateBuff(0);
            if (getCurrentHP() <=0) setDefeated();
        }
    }
    public void victory() {
        System.out.println("The Warrior won! remaining HP = " + getCurrentHP());
    }

    @Override
    public String stringCurrentHP() {
        return "Warrior HP =" + getCurrentHP();
    }
}