public class MUDCombinedDemo {
    public static void main(String[] args) {

        Room template = new Room("Template Room", "Basic stone room");

        IDungeonBuilder builder = new SimpleDungeonBuilder();
        Dungeon dungeon = builder
                .setDungeonName("Cloned Dungeon")
                .addClonedRooms(template, 3)
                .addNPC(new NPC("Skeleton", "Bony guardian", 30))
                .build();
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