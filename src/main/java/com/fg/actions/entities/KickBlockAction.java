package com.fg.actions.entities;

import com.fg.actions.PerformAction;
import com.fg.game.services.entities.Player;

/**
 * Created by raheela on 01/02/2019.
 */
public class KickBlockAction extends Action implements PerformAction {

    public static int coinsDeducted = 15;

    public KickBlockAction() {
    }

    public KickBlockAction(int id, String name) {
        super(id, name);
    }

    public static int getCoinsDeducted() {
        return coinsDeducted;
    }

    public static void setCoinsDeducted(int coinsDeducted) {
        KickBlockAction.coinsDeducted = coinsDeducted;
    }

    @Override
    public void execute(Player player, Action opponentAction) {
        deductCoins(player, coinsDeducted, opponentAction.getName());
    }
}
