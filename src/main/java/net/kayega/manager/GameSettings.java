package net.kayega.manager;

public interface GameSettings {
    int getSeekerCount();
    void setSeekerCount(int seekerCount);

    int getLobbyStartTime();
    void setLobbyStartTime(int lobbyStartTime);

    int getLobbyMinPlayer();
    void setLobbyMinPlayer(int lobbyMinPlayer);

    int getSeekerReleaseTime();
    void setSeekerReleaseTime(int seekerReleaseTime);
}
