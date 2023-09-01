package net.kayega.impl;

import net.kayega.manager.GameSettings;
import org.bukkit.World;

public class GameSettingsImpl implements GameSettings {
    int seekerCount;
    int lobbyStartTime;
    int lobbyMinPlayer;
    int seekerReleaseTime;
    World world;

    @Override
    public int getSeekerCount() {
        return this.seekerCount;
    }

    @Override
    public void setSeekerCount(int seekerCount) {
        this.seekerCount = seekerCount;
    }

    @Override
    public int getLobbyStartTime() {
        return this.lobbyStartTime;
    }

    @Override
    public void setLobbyStartTime(int lobbyStartTime) {
        this.lobbyStartTime = lobbyStartTime;
    }

    @Override
    public int getLobbyMinPlayer() {
        return this.lobbyMinPlayer;
    }

    @Override
    public void setLobbyMinPlayer(int lobbyMinPlayer) {
        this.lobbyMinPlayer = lobbyMinPlayer;
    }

    @Override
    public int getSeekerReleaseTime() {
        return this.seekerReleaseTime;
    }

    @Override
    public void setSeekerReleaseTime(int seekerReleaseTime) {
        this.seekerReleaseTime = seekerReleaseTime;
    }

    @Override
    public World getWorld() {
        return world;
    }

    @Override
    public void setWorld(World world) {
        this.world = world;
    }
}
