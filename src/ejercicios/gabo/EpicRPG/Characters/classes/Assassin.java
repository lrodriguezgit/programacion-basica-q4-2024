package Characters.classes;

import Characters.Character;
import Characters.Skills.Skill;

import java.util.ArrayList;
import java.util.List;

public class Assassin extends Character {
    private double currentPower;

    public Assassin() {
        super(235, 50, new ArrayList<Skill>());
        Skill skill1 = new Skill("Basic attack", "Basic attack", "BASIC");
        Skill skill2 = new Skill("Assassin's instinct", "Increases your power by 40 points for three attacks", "BUFF");
        Skill skill3 = new Skill("Lacerate", "Inflicts the equivalent of 2x your power points", "SP");
        currentPowerIni(Power);
        this.AddSkill(skill1);
        this.AddSkill(skill2);
        this.AddSkill(skill3);
    }


    public void currentPowerIni (double power){
        this.currentPower = power;

    }

    @Override
    public void normalAttack(Character target) {
        target.receiveDMG(this.currentPower);
        if (buffEnable){
            reduceBuff();
            if (buffDuration == 0) setCurrentPower(this.Power);
        }

    }

    @Override
    public void buffSkill() {
        activateBuff(3);
        setCurrentPower(40);
    }

    @Override
    public void specialSkill(Character target) {
        if (this.buffEnable) {
            target.receiveDMG(currentPower * 2);
            reduceBuff();
            if (buffDuration == 0) setCurrentPower(this.Power);
        }
        else{
            target.receiveDMG(currentPower);
        }
    }



    @Override
    public void receiveDMG(double DMG) {
        this.updateCurrentHP(getCurrentHP() - DMG);
        if (getCurrentHP() <=0) setDefeated();
    }

    public void setCurrentPower(double newPower){
        this.currentPower =  this.Power + newPower;
    }
    public void victory() {
        System.out.println("The Assassin won! remaining HP = " + getCurrentHP());
    }

    @Override
    public String stringCurrentHP() {
        return "Assassin HP =" + getCurrentHP();
    }
}