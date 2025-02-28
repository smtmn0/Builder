
public class NPC {
    private String name;
    private String description;
    private int health;

    public NPC(String name, String description, int health) {
        this.name = name;
        this.description = description;
        this.health = health;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }
}