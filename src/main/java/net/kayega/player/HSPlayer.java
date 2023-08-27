package net.kayega.player;

import org.bukkit.entity.Player;

import java.util.UUID;

public interface HSPlayer {
    UUID getId();
    String getName();

    HSTeam getTeam();
    boolean setTeam(HSTeam newTeam);

    boolean useEscapeKey();

    Player asPlayer();
}
