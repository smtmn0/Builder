public class Room implements CloneableGameEntity {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public void setName(String name) { this.name = name; }

    @Override
    public Room cloneEntity() {
        return new Room(this.name, this.description);
    }
}