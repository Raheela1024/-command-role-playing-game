package com.fg.game.services.services;

import com.fg.game.services.entities.Game;

/**
 * Created by raheela on 01/02/2019.
 */
public interface IGame {

    void init(Game game);

    void play(Game game);

    void resume(Game game);

    void save(Game game);

}
