package net.kayega.manager;

import org.bukkit.World;

public interface GameSettings {
    int getSeekerCount();
    void setSeekerCount(int seekerCount);

    int getLobbyStartTime();
    void setLobbyStartTime(int lobbyStartTime);

    int getLobbyMinPlayer();
    void setLobbyMinPlayer(int lobbyMinPlayer);

    int getSeekerReleaseTime();
    void setSeekerReleaseTime(int seekerReleaseTime);

    World getWorld();
    void setWorld(World world);
}
