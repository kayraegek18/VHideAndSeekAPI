package net.kayega.impl;

import net.kayega.builder.HSPlayerBuilder;
import net.kayega.manager.PlayerManager;
import net.kayega.player.HSPlayer;
import net.kayega.player.HSTeam;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PlayerManagerImpl implements PlayerManager {
    List<HSPlayer> players;

    public PlayerManagerImpl() {
        players = new ArrayList<>();
    }

    @Override
    public void createPlayer(HSPlayerBuilder builder) {
        players.add(builder.build());
    }

    @Override
    public void createPlayer(HSPlayer player) {
        players.add(player);
    }

    @Override
    public HSPlayer getPlayer(Player player) {
        return getPlayer(player.getUniqueId());
    }

    @Override
    public HSPlayer getPlayer(UUID uuid) {
        for (HSPlayer hsPlayer : players)
            if (hsPlayer.getId().equals(uuid))
                return hsPlayer;
        return null;
    }

    @Override
    public List<HSPlayer> getPlayers() {
        return this.players;
    }
}
