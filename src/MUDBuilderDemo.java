public class MUDBuilderDemo {
    public static void main(String[] args) {
        IDungeonBuilder builder = new SimpleDungeonBuilder();
        Dungeon dungeon = builder.setDungeonName("Dark Cave")
                .addRoom(new Room("Entrance", "Moss-covered walls"))
                .addRoom(new Room("Hall", "Torch-lit hall"))
                .addNPC(new NPC("Goblin", "Sneaky guard", 50))
                .build();

        System.out.println("Dungeon: " + dungeon.getName());
        System.out.println("Rooms:");
        dungeon.getRooms().forEach(room ->
                System.out.println(room.getName() + ": " + room.getDescription()));
        System.out.println("NPCs:");
        dungeon.getNpcs().forEach(npc ->
                System.out.println(npc.getName() + " (HP: " + npc.getHealth() + ")"));
    }
}