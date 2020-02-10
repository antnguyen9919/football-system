package People;

public class People {
    // private sets the Encapsulation. Encapsulation prevents the class from being summoned.
    // Setter allows another class to (only) summon the encapsulated attribute.
    // Getter allows another class to set value to the summoned encapsulated attribute.
    private String name;
    private int age;
    private int height;
    private int weight;
    private String nationality;
    private int experience;

    public People(String name, int age, int height, int weight, String nationality, int experience) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getNationality() {
        return nationality;
    }

    public int getExperience() {
        return experience;
    }
}
