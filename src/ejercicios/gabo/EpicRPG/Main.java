package ejercicios.gabo.EpicRPG;

import Characters.classes.Assassin;
import Characters.classes.Mage;
import Characters.classes.Warrior;


public class Main {
    public static void main(String[] args) {
        Warrior beowulf = new Warrior();
        Mage merlin = new Mage();
        Assassin rogue = new Assassin();

        Battle epic_battle = new Battle(beowulf, rogue);

        epic_battle.playTurn(Actions.SPECIAL_ATTACK, Actions.BUFF);
        epic_battle.playTurn(Actions.SPECIAL_ATTACK, Actions.SPECIAL_ATTACK);
        epic_battle.playTurn(Actions.SPECIAL_ATTACK, Actions.SPECIAL_ATTACK);
    }
}

//NORMAL_ATTACK / BUFF / SPECIAL_ATTACK