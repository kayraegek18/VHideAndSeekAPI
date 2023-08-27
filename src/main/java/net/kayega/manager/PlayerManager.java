package net.kayega.manager;

import net.kayega.builder.HSPlayerBuilder;
import net.kayega.player.HSPlayer;
import net.kayega.player.HSTeam;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.UUID;

public interface PlayerManager {

    void createPlayer(HSPlayerBuilder builder);
    void createPlayer(HSPlayer player);

    HSPlayer getPlayer(Player player);
    HSPlayer getPlayer(UUID uuid);

    List<HSPlayer> getPlayers();
}
