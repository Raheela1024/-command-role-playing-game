package com.fg.game.services.entities;

import com.fg.actions.entities.KickBlockAction;
import com.fg.actions.entities.MoveAction;
import com.fg.actions.entities.PunchBlockAction;
import com.fg.actions.entities.PushBackAction;
import com.fg.character.Character;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by raheela on 01/02/2019.
 */
public class Game implements Serializable {

    private Player player1;
    private Player player2;
    private boolean isPlay;

    public Game(Player player) {
        this.player1 = player;
        this.player2 = new Player(new Character(2, "Raheela", Arrays.asList(
                new KickBlockAction(1, "Kick Block"),
                new MoveAction(2, "Move"),
                new PunchBlockAction(3, "Punch Block"),
                new PushBackAction(4, "Push Back"))));
        isPlay = true;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }


    public boolean isPlay() {
        return isPlay;
    }

    public void setPlay(boolean play) {
        isPlay = play;
    }

    @Override
    public String toString() {
        return new StringBuffer(" Is Play ").append(isPlay)
                .append(" Player 1: ").append(this.getPlayer1()).append(" Player 2 : ").append(this.getPlayer2()).toString();
    }
}
