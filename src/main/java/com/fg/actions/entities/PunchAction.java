package com.fg.actions.entities;

import com.fg.actions.PerformAction;
import com.fg.game.services.entities.Player;
import com.fg.utils.CommonUtils;

/**
 * Created by raheela on 01/02/2019.
 */
public class PunchAction extends Action implements PerformAction {

    public static int coinsDeducted = 20;

    public PunchAction() {
    }

    public PunchAction(int id, String name) {
        super(id, name);
    }


    @Override
    public void execute(Player player, Action opponentAction) {
        if (!ActionName.PUNCH_BLOCK.equals(opponentAction.getName())) {
            deductCoins(player, coinsDeducted, opponentAction.getName());
        } else {
            CommonUtils.printMessage("Waoo!! no action is performed ");

        }
    }
}
