package Characters;

import Characters.Skills.Skill;

import java.util.List;

public abstract class Character {
    //Attributes

    protected double HP;
    protected double Power;
    protected List <Skill> Abilities;
    protected double CurrentHP;
    protected boolean buffEnable;
    protected int buffDuration;
    protected boolean alive;


    //Skills
    public abstract void normalAttack(Character target);
    public abstract void buffSkill ();
    public abstract void specialSkill (Character target);


    //Constructor
    public Character (double HP, double Power, List<Skill> Abilities){
        this.HP = HP;
        this.Power = Power;
        this.Abilities = Abilities;
        this.CurrentHP = HP;
        this.buffEnable = false;
        this.buffDuration = 0;
        this.alive = true;


    }

    //Agregar habilidades
    protected void AddSkill(Skill nuevaSkill){
        this.Abilities.add(nuevaSkill);
    }

    //Buff
    private void setBuff(boolean state){
        this.buffEnable = state;
    }

    private void setBuffDuration(int buffDuration){
        this.buffDuration = buffDuration;
    }

    public void activateBuff (int buffDuration){
        this.setBuff(true);
        this.setBuffDuration(buffDuration);
    }

    public void deactivateBuff (int buffDuration){
        this.setBuff(false);
        this.setBuffDuration(buffDuration);
    }

    public void reduceBuff (){
        if (this.buffDuration > 1){
            this.buffDuration--;
        }
        else{
            deactivateBuff(0);
        }
    }


    //Ser atacado
    private void setCurrentHP(double DMG){
        this.CurrentHP = DMG;

    }

    public void updateCurrentHP(double HP){
        this.setCurrentHP(HP);
    }

    public abstract void receiveDMG (double DMG);

    public double getCurrentHP (){
        return this.CurrentHP;
    }

    public abstract void victory ();

    public void setDefeated (){
        this.alive = false;
    }

    public boolean isAlive (){
        return this.alive;
    }

    public abstract String stringCurrentHP ();


}