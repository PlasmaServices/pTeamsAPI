package services.plasma.pTeams.teams;

import lombok.Data;
import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Data
public class Team {

    private UUID id;
    private String name;
    private String description;
    private ChatColor color;
    private HashMap<UUID, TeamRole> members;
    private int chestSize;
    private List<String> chestItems;
    private int maxHomes;
    private HashMap<String, String> homes;
    private UUID owner;


    public Team(String name, UUID owner) {
        this.id = UUID.randomUUID();
        this.name = name;

        this.description = "";
        this.color = ChatColor.WHITE;
        this.members = new HashMap<>();
        this.chestSize = 9;
        this.chestItems = new ArrayList<>();
        this.maxHomes = 3;
        this.homes = new HashMap<>();
        this.owner = owner;
    }


    public Team(String name, UUID owner, UUID id, String description, ChatColor color, HashMap<UUID, TeamRole> members, int chestSize, List<String> chestItems, int maxHomes, HashMap<String, String> homes) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.description = description;
        this.color = color;
        this.members = members;
        this.chestSize = chestSize;
        this.chestItems = chestItems;
        this.maxHomes = maxHomes;
        this.homes = homes;
    }
}
