package net.kayega.manager;

import net.kayega.player.HSPlayer;
import org.bukkit.entity.Player;

public interface GameManager {
    void startGame(Player player);
    void stopGame(Player player);

    boolean useEscapeKey(HSPlayer player);

    GameSettings getSettings();
}
