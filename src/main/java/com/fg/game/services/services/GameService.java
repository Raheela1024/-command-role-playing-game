package com.fg.game.services.services;

import com.fg.actions.entities.Action;
import com.fg.actions.services.ActionService;
import com.fg.exceptions.FGExceptions;
import com.fg.game.services.entities.Game;
import com.fg.game.services.entities.Player;
import com.fg.utils.CommonUtils;
import com.fg.utils.FileUtils;
import com.fg.utils.ScannerUtils;

/**
 * Created by raheela on 01/02/2019.
 */
public class GameService implements IGame {

    private ActionService actionService = new ActionService();

    @Override
    public void play(Game game) {
        Player player1 = game.getPlayer1();
        Player player2 = game.getPlayer2();
        while (game.isPlay()) {
            actionService.showActions(player1.getCharacter());
            System.out.print("Please Enter you next Move: ");
            String userAction = ScannerUtils.getNextString();
            if ("S".equalsIgnoreCase(userAction)) {
                save(game);
                break;
            }
            int opponentActionId = CommonUtils.getRandomNumber(3);
            Action opponentAction = actionService.getAction(player2.getCharacter(), opponentActionId);
            player1.performAction(player2, CommonUtils.stringToInput(userAction), opponentAction);
            System.out.println("****************************\n");
            checkCoins(game);

        }
    }

    @Override
    public void resume(Game game) {
        play(game);
    }

    @Override
    public void save(Game game) {
        try {
            FileUtils.stringToFile(game);
            System.out.println("GameService is Saved Successfully");
        } catch (Exception e) {
            throw new FGExceptions(e, "Game is not saved !!");
        }
    }

    public void checkCoins(Game game) {
        Player player1 = game.getPlayer1();
        Player player2 = game.getPlayer2();
        if (player2.getCoins() <= 0) {
            System.out.println(game.getPlayer1().getCharacter().getName() + "!! wins!!");
            game.setPlay(false);
        } else if (player1.getCoins() <= 0) {
            System.out.println(player1.getCharacter().getName() + " is Dead !! " + player2.getCharacter().getName() + " wins!!");
            game.setPlay(false);
        }
    }

    @Override
    public void init(Game game) {
        Player player1 = game.getPlayer1();
        Player player2 = game.getPlayer2();
        System.out.println(player1.getCharacter().getName() + " you are playing with " + player2.getCharacter().getName() + "!!! Your Coins are :" + player2.getCoins());
        System.out.println(player1.getCharacter().getName() + " you can perform");
        actionService.showActionsWithOutOperations(player1.getCharacter());
        System.out.println("Are you Ready " + player1.getCharacter().getName() + " !!!");
        System.out.println("To SAVE Press \b S  \n");
        System.out.println("***Loading*** \n");
        System.out.println(" ");
    }

}
