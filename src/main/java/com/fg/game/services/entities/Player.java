package com.fg.game.services.entities;

import com.fg.actions.PerformAction;
import com.fg.actions.entities.Action;
import com.fg.character.Character;

import java.io.Serializable;

/**
 * Created by raheela on 01/02/2019.
 */
public class Player implements Serializable {

    private int coins = 100;
    private Character character;
    private PerformAction[] performAction;

    public Player() {
    }

    public Player(Character character) {
        this.character = character;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public PerformAction[] getPerformAction() {
        return performAction;
    }

    public void setPerformAction(PerformAction[] performAction) {
        this.performAction = performAction;
    }

    public void performAction(Player player, int actionId, Action opponentAction) {
        PerformAction performAction = (PerformAction) character.getActions().stream()
                .filter(action -> action.getId() == actionId)
                .findAny().orElse(null);
        if (performAction != null) {
            performAction.execute(player, opponentAction);
            ((PerformAction) opponentAction).execute(this, (Action) performAction);
        } else {
            System.out.println("Please Select the valid action !!");
        }
    }

    @Override
    public String toString() {
        return new StringBuffer(" coins ").append(this.getCoins())
                .append(" Character: ").append(this.getCharacter()).append(" Action Performed : ").append(this.getPerformAction()).toString();
    }
}
