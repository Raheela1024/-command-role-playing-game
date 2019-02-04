package com.fg.actions;

import com.fg.actions.entities.Action;
import com.fg.game.services.entities.Player;

/**
 * Created by raheela on 01/02/2019.
 */
public interface PerformAction {

    void execute(Player player, Action action);
}
