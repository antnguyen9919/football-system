package People;

public class Manager extends People{
    //inheritance from People.People
    private String achievements;
    private String coachingStyle[]={"Counter Attack", "Ball Control", "Wings Attack"};

    public Manager(String name, int age, int height, int weight, String nationality, int experience) {
        super(name, age, height, weight, nationality, experience);
    }
}