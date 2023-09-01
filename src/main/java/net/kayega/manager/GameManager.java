package net.kayega.manager;

import net.kayega.player.HSPlayer;
import org.bukkit.entity.Player;

public interface GameManager {
    void startGame(Player player, Game game);
    void stopGame(Player player, Game game);

    boolean useEscapeKey(HSPlayer player);

    GameSettings getSettings();
}
