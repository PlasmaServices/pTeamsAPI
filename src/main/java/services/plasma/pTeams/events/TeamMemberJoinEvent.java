package services.plasma.pTeams.events;

import lombok.Getter;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import services.plasma.pTeams.teams.Team;
import services.plasma.pTeams.teams.TeamRole;

import java.util.UUID;

@Getter
public class TeamMemberJoinEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final Team team;
    private final UUID playerUUID;
    private final TeamRole role;
    private final Cause cause;

    public TeamMemberJoinEvent(Team team, UUID playerUUID, TeamRole role, Cause cause) {
        this.team = team;
        this.playerUUID = playerUUID;
        this.role = role;
        this.cause = cause;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public enum Cause {
        CREATED,
        INVITE,
        ADMIN
    }

}
