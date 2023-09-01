package net.kayega.impl;

import net.kayega.manager.Game;
import net.kayega.manager.GameSettings;

public class GameImpl implements Game {

    GameSettings settings;

    public GameImpl(GameSettings settings) {
        this.settings = settings;
    }

    @Override
    public GameSettings getGameSettings() {
        return settings;
    }
}
