public class Main {
    public static void main(String[] args) {
        // Create a Dungeon Builder
        IDungeonBuilder builder = new SimpleDungeonBuilder();

        // Use the builder to construct a Dungeon
        Dungeon dungeon = builder
                .setDungeonName("Forgotten Crypt") // Set dungeon name
                .addRoom(new Room("Entrance", "A crumbling stone archway")) // Add rooms
                .addRoom(new Room("Chamber of Shadows", "Flickering torches illuminate eerie carvings"))
                .addNPC(new NPC("Lich King", "Undead ruler of the crypt", 250)) // Add NPCs
                .build(); // Finalize the build

        // Print the constructed Dungeon
        System.out.println("=== Dungeon Built ===");
        System.out.println("Name: " + dungeon.getName());
        System.out.println("\nRooms:");
        for (Room room : dungeon.getRooms()) {
            System.out.println("- " + room.getName() + ": " + room.getDescription());
        }
        System.out.println("\nNPCs:");
        for (NPC npc : dungeon.getNpcs()) {
            System.out.println("- " + npc.getName() + " (HP: " + npc.getHealth() + ")");
        }
    }
}