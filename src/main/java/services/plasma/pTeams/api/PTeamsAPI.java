package services.plasma.pTeams.api;

import org.bson.Document;
import services.plasma.pTeams.teams.Team;

import java.util.List;
import java.util.UUID;

public enum PTeamsAPI {

    INSTANCE;

    public boolean isInTeam(UUID uuid, String teamName) {
        throw new RuntimeException("PTeamsAPI is not a plugin!");
    }

    public String getTeamName(UUID uuid) {
        throw new RuntimeException("PTeamsAPI is not a plugin!");
    }

    public void deleteTeam(String teamName, UUID ownerUUID) {
        throw new RuntimeException("PTeamsAPI is not a plugin!");
    }

    public void createTeam(String teamName) {
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

}
