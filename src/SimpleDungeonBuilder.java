import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilder implements IDungeonBuilder {
    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<NPC> npcs = new ArrayList<>();

    @Override
    public IDungeonBuilder setDungeonName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public IDungeonBuilder addRoom(Room room) {
        rooms.add(room);
        return this;
    }

    @Override
    public IDungeonBuilder addNPC(NPC npc) {
        npcs.add(npc);
        return this;
    }

    @Override
    public Dungeon build() {
        return new Dungeon(name, rooms, npcs);
    }

    public IDungeonBuilder addClonedRooms(Room prototype, int count) {
        for (int i = 0; i < count; i++) {
            Room clone = prototype.cloneEntity();
            clone.setName(prototype.getName() + " Clone " + (i + 1));
            rooms.add(clone);
        }
        return this;
    }
}