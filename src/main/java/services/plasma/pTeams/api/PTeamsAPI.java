package services.plasma.pTeams.api;

import org.bson.Document;
import org.bukkit.entity.Player;
import services.plasma.pTeams.teams.Team;
import services.plasma.pTeams.teams.TeamRole;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public enum PTeamsAPI {

    INSTANCE;

    public boolean isInTeam(UUID uuid, String teamName) {
        throw new RuntimeException("PTeamsAPI is not a plugin!");
    }

    public String getTeamName(UUID uuid) {
        throw new RuntimeException("PTeamsAPI is not a plugin!");
    }

    public void deleteTeam(String teamName) {
        throw new RuntimeException("PTeamsAPI is not a plugin!");
    }

    public void createTeam(String teamName, UUID ownerUUID) {
        throw new RuntimeException("PTeamsAPI is not a plugin!");
    }

    public List<Document> getAllTeams() {
        throw new RuntimeException("PTeamsAPI is not a plugin!");
    }

    public long getTotalTeamCount() {
        throw new RuntimeException("PTeamsAPI is not a plugin!");
    }

    public boolean isInTeamChat(UUID uuid) {
        throw new RuntimeException("PTeamsAPI is not a plugin!");
    }

    public Team getTeam(String teamName) {
        throw new RuntimeException("PTeamsAPI is not a plugin!");
    }

    public Team getTeamIgnoreCase(String teamName) {
        throw new RuntimeException("PTeamsAPI is not a plugin!");
    }

    public Team getTeam(UUID uuid) {
        throw new RuntimeException("PTeamsAPI is not a plugin!");
    }

    public Team getTeamById(UUID teamId) {
        throw new RuntimeException("PTeamsAPI is not a plugin!");
    }

    public TeamRole getRole(UUID uuid) {
        throw new RuntimeException("PTeamsAPI is not a plugin!");
    }

    public Set<UUID> getMembers(Team team) {
        throw new RuntimeException("PTeamsAPI is not a plugin!");
    }

    public List<Player> getOnlineMembers(Team team) {
        throw new RuntimeException("PTeamsAPI is not a plugin!");
    }

    public boolean areTeammates(UUID uuid, UUID other) {
        throw new RuntimeException("PTeamsAPI is not a plugin!");
    }

    public boolean isTeamChatEnabled() {
        throw new RuntimeException("PTeamsAPI is not a plugin!");
    }

}
