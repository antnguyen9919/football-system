package People;

public class Player extends People {
    public void runningSpeed(int moveSpeed){
        System.out.println(this.getName()+" running speed is"+moveSpeed+" km/h");
    }

    public void reaction(){
        //This method depends on personality, which is complicated.
    }
    public void playStyle(){
        //
    }


    // inheritance from people.
    private String dominantFoot;
    private String mainPosition[] = {"Goalkeeper", "Right Fullback", "Centre Back", "Left fullback",
            "Midfielder", "Right Midfielder", "Left Midfielder", "Play-maker", "Defensive Midfielder",
            "Striker", "Forward", "Left Winger", "Right Winger"};
    private String achievements;
    boolean injury;
    private String stamina[]={"Lowest", "Medium", "Highest"};
    private int currentPerformance;

    public Player(String name, int age, int height, int weight, String nationality, int experience) {
        super(name, age, height, weight, nationality, experience);
    }
}

