package net.kayega.player;

import net.kayega.manager.Game;
import org.bukkit.entity.Player;

import java.util.UUID;

public interface HSPlayer {
    UUID getId();
    String getName();

    HSTeam getTeam();
    boolean setTeam(HSTeam newTeam);

    boolean useEscapeKey();

    Player asPlayer();
    Game getGame();
}
