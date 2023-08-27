package net.kayega.manager;

public enum GameStatus {
    WAITING_PLAYERS(1, "Waiting Players"),
    WAITING_TIME(2, "Waiting Time"),
    STARTED(3, "Started"),
    FINISHED(4, "Finished"),
    STOPPED(0, "Stopped"),
    UNKNOWN(5, "Unknown");

    final int id;
    final String name;
    GameStatus(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static GameStatus getStatus(int id) {
        for (GameStatus status : values())
            if (status.id == id)
                return status;
        return GameStatus.UNKNOWN;
    }

    static GameStatus getStatus(String name) {
        for (GameStatus status : values())
            if (status.name.equalsIgnoreCase(name))
                return status;
        return GameStatus.UNKNOWN;
    }

    @Override
    public String toString() {
        return name;
    }
}
