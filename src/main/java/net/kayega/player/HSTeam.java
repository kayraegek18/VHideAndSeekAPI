package net.kayega.player;

public enum HSTeam {
    Hider(1, "hider"),
    Seeker(2, "seeker"),
    Spectator(3, "spectator"),
    None(0, "unknown");

    final int id;
    final String name;
    HSTeam(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    static HSTeam getTeam(int id) {
        for (HSTeam team : values())
            if (team.id == id)
                return team;
        return HSTeam.None;
    }

    static HSTeam getTeam(String name) {
        for (HSTeam team : values())
            if (team.name.equalsIgnoreCase(name))
                return team;
        return HSTeam.None;
    }

    @Override
    public String toString() {
        return name;
    }
}
