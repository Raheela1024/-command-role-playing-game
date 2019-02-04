package com.fg.actions.entities;

import com.fg.game.services.entities.Player;

import java.io.Serializable;

/**
 * Created by raheela on 01/02/2019.
 */
public class Action implements Serializable {

    private int id;
    private String name;

    public Action() {
    }

    public Action(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deductCoins(Player player, int coinsToDeduct, String actionName) {
        player.setCoins(player.getCoins() - coinsToDeduct);
        System.out.println("Ohh " + actionName + ":(");
        System.out.println(player.getCharacter().getName() + " better step up his game!");
        System.out.println(player.getCharacter().getName() + " Your Coins are !! " + (player.getCoins() >= 0 ? player.getCoins() : 0));
    }

    @Override
    public String toString() {
        return new StringBuffer(" id ").append(this.getId())
                .append(" Name: ").append(this.getName()).toString();
    }
}
