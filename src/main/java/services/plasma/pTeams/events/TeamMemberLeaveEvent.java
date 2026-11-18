package services.plasma.pTeams.events;

import lombok.Getter;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import services.plasma.pTeams.teams.Team;
import services.plasma.pTeams.teams.TeamRole;

import java.util.UUID;

@Getter
public class TeamMemberLeaveEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final Team team;
    private final UUID playerUUID;
    private final TeamRole previousRole;
    private final Reason reason;
    private final UUID removedBy;

    public TeamMemberLeaveEvent(Team team, UUID playerUUID, TeamRole previousRole, Reason reason, UUID removedBy) {
        this.team = team;
        this.playerUUID = playerUUID;
        this.previousRole = previousRole;
        this.reason = reason;
        this.removedBy = removedBy;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public enum Reason {
        LEFT,
        KICKED,
        ADMIN_REMOVED,
        DISBANDED
    }

}
