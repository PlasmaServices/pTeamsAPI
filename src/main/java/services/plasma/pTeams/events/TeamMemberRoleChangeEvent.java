package services.plasma.pTeams.events;

import lombok.Getter;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import services.plasma.pTeams.teams.Team;
import services.plasma.pTeams.teams.TeamRole;

import java.util.UUID;

@Getter
public class TeamMemberRoleChangeEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final Team team;
    private final UUID playerUUID;
    private final TeamRole oldRole;
    private final TeamRole newRole;
    private final UUID changedBy;

    public TeamMemberRoleChangeEvent(Team team, UUID playerUUID, TeamRole oldRole, TeamRole newRole, UUID changedBy) {
        this.team = team;
        this.playerUUID = playerUUID;
        this.oldRole = oldRole;
        this.newRole = newRole;
        this.changedBy = changedBy;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
