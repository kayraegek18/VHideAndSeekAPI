package net.kayega.builder;

import net.kayega.impl.HSPlayerImpl;
import net.kayega.manager.Game;
import net.kayega.player.HSPlayer;
import net.kayega.player.HSTeam;
import org.bukkit.entity.Player;

import java.util.UUID;

public class HSPlayerBuilder {
    UUID uuid;
    Player player;
    HSTeam team;
    Game game;

    public HSPlayerBuilder(Player player) {
        this.uuid = player.getUniqueId();
        this.player = player;
        this.team = HSTeam.None;
    }

    public HSPlayerBuilder setTeam(HSTeam newTeam) {
        team = newTeam;
        return this;
    }

    public HSPlayerBuilder setGame(Game newGame) {
        game = newGame;
        return this;
    }

    public HSPlayer build() {
        return new HSPlayerImpl(player, team, game);
    }
}
