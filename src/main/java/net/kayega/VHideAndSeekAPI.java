package net.kayega;

import net.kayega.impl.PlayerManagerImpl;
import net.kayega.manager.GameManager;
import net.kayega.manager.GameSettings;
import net.kayega.manager.PlayerManager;
import net.kayega.player.HSPlayer;
import org.bukkit.entity.Player;

import java.util.UUID;

public final class VHideAndSeekAPI {
    PlayerManager playerManager;
    GameManager gameManager;

    public VHideAndSeekAPI(GameManager manager) {
        playerManager = new PlayerManagerImpl();
        gameManager = manager;
    }

    public PlayerManager getPlayerManager() {
        return playerManager;
    }

    public GameManager getGameManager() {
        return gameManager;
    }

    HSPlayer getPlayer(Player player) {
        return playerManager.getPlayer(player);
    }

    HSPlayer getPlayer(UUID id) {
        return playerManager.getPlayer(id);
    }

    GameSettings getSettings() {
        return gameManager.getSettings();
    }
}
