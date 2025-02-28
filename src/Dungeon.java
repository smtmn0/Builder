import java.util.List;

public class Dungeon {
    private final String name;
    private final List<Room> rooms;
    private final List<NPC> npcs;

    public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
    }

    public String getName() { return name; }
    public List<Room> getRooms() { return rooms; }
    public List<NPC> getNpcs() { return npcs; }
}