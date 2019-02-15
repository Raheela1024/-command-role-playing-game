package com.fg.actions.entities;

import com.fg.actions.PerformAction;
import com.fg.game.services.entities.Player;

/**
 * Created by raheela on 01/02/2019.
 */
public class PunchBlockAction extends Action implements PerformAction {
    public static int coinsDeducted = 5;

    public PunchBlockAction() {
    }

    public PunchBlockAction(int id, String name) {
        super(id, name);
    }

    @Override
    public void execute(Player player, Action opponentAction) {
        deductCoins(player, coinsDeducted, opponentAction.getName());
    }
}
