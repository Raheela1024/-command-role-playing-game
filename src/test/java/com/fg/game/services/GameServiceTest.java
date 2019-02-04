package com.fg.game.services;

import com.fg.actions.entities.KickBlockAction;
import com.fg.actions.entities.MoveAction;
import com.fg.actions.entities.PunchBlockAction;
import com.fg.actions.entities.PushBackAction;
import com.fg.actions.services.ActionService;
import com.fg.character.Character;
import com.fg.game.services.entities.Game;
import com.fg.game.services.entities.Player;
import com.fg.game.services.services.GameService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Arrays;

@RunWith(PowerMockRunner.class)
public class GameServiceTest {

    @InjectMocks
    private GameService gameService;
    @Mock
    private ActionService actionService;

    @Test
    public void testInit() {
        gameService.init(getGame());
    }

    @Test
    public void testPlay() {
        String inputData = "1\n2\n3\n3\n2\n1\n2\n3\n2\n4\n3\n" +
                "1\n2\n3\n2\n4\n3\n1\n2\n3\n2\n4\n3\n";
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
        Mockito.when(actionService.getAction(Mockito.any(Character.class), Mockito.anyInt())).thenReturn(new MoveAction(2, "Move"));
        gameService.play(getGame());
    }

    @Test
    public void testSave() {
        gameService.save(getGame());
    }

    public Game getGame() {
        Player player = new Player(new Character(1, "test", Arrays.asList(
                new KickBlockAction(1, "Kick Block"),
                new MoveAction(2, "Move"),
                new PunchBlockAction(3, "Punch Block"),
                new PushBackAction(4, "Push Back"))));
        return new Game(player);
    }
}


