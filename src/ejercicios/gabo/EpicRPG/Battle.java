package ejercicios.gabo.EpicRPG;

import Characters.Character;

public class Battle {
    private final Character character1;
    private final Character character2;

    public Battle(Character ch1, Character ch2) {
        this.character1 = ch1;
        this.character2 = ch2;
    }

    public void playTurn(Actions action1, Actions action2) {
        switch (action1) {
            case BUFF:
                character1.buffSkill();
                break;
            case NORMAL_ATTACK:
                character1.normalAttack(character2);
                break;
            case SPECIAL_ATTACK:
                character1.specialSkill(character2);
                break;
        }
        if (!character2.isAlive()){
            character1.victory();
        }
        else{
            switch (action2) {
                case BUFF:
                    character2.buffSkill();
                    break;
                case NORMAL_ATTACK:
                    character2.normalAttack(character1);
                    break;
                case SPECIAL_ATTACK:
                    character2.specialSkill(character1);
                    break;
            }
        }
        if (!character1.isAlive()){
            character2.victory();
        }
        else {
            System.out.println(character1.stringCurrentHP() + " " + character2.stringCurrentHP());
        }
    }

}