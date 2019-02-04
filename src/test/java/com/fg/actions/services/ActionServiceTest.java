package com.fg.actions.services;

import com.fg.actions.entities.*;
import com.fg.character.Character;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(PowerMockRunner.class)
public class ActionServiceTest {

    @InjectMocks
    private ActionService actionService;

    @Test
    public void testGetAction() {
        Action action = actionService.getAction(getCharacter(), 1);
        Assert.assertEquals(action.getId(), 1);
    }

    @Test
    public void testShowActions() {
        actionService.showActions(getCharacter());
    }


    @Test
    public void testShowActionsWithOutOperations() {
        actionService.showActionsWithOutOperations(getCharacter());
    }

    private Character getCharacter() {
        return new Character(1, "Character Name", getActions());
    }

    private List<Action> getActions() {
        return Arrays.asList(
                new KickAction(1, "Kick"),
                new PunchAction(2, "Punch"),
                new KickBlockAction(3, "Kick Block"),
                new PushBackAction(4, "Push Back"));
    }


}
