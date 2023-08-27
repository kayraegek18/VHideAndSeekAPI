package net.kayega.impl;

import net.kayega.player.HSPlayer;
import net.kayega.player.HSTeam;
import org.bukkit.entity.Player;

import java.util.UUID;

public class HSPlayerImpl implements HSPlayer {

    Player player;
    HSTeam team;

    public HSPlayerImpl(Player player, HSTeam team) {
        this.player = player;
        this.team = team;
    }

    @Override
    public UUID getId() {
        return player.getUniqueId();
    }

    @Override
    public String getName() {
        return player.getName();
    }

    @Override
    public HSTeam getTeam() {
        return team;
    }

    @Override
    public boolean setTeam(HSTeam newTeam) {
        return false;
    }

    @Override
    public boolean useEscapeKey() {
        return false;
    }

    @Override
    public Player asPlayer() {
        return player;
    }
}
