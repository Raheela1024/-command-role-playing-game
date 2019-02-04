package com.fg.actions.services;

import com.fg.actions.entities.*;
import com.fg.character.Character;

import java.util.ArrayList;

/**
 * Created by raheela on 01/02/2019.
 */
public class ActionService {

    public ArrayList<Action> actions = new ArrayList<>();

    public ActionService() {
        actions.add(new KickAction(1, "Kick"));
        actions.add(new PunchAction(2, "Punch"));
        actions.add(new KickBlockAction(3, "Kick Block"));
        actions.add(new PushBackAction(4, "Push Back"));
    }

    public Action getAction(Character character, int id) {
        return character.getActions().stream().filter(action -> action.getId() == id)
                .findAny()
                .orElse(null);
    }


    public void showActions(Character character) {
        if (character.getActions() != null && !character.getActions().isEmpty()) {
            System.out.println("Please perform an action !!!");
            character.getActions().forEach(action -> System.out.println(action.getId() + ". " + action.getName()));
        }
    }

    public void showActionsWithOutOperations(Character character) {
        if (character.getActions() != null && !character.getActions().isEmpty()) {
            character.getActions().forEach(action -> System.out.println("[" + action.getName() + "]"));
        }
    }

    public ArrayList<Action> getActions() {
        return actions;
    }
}
