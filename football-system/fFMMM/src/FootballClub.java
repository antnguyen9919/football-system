public class FootballClub extends SportsClub {

    private int winCount;
    private int drawCount;
    private int defeatCount;
    private int scoredGoalsCount;
    private int receivedGoalsCount;
    private int points;
    private int matchesPlayed;


    public int getWinCount() {
        return winCount;
    }

    public int getDrawCount() {
        return drawCount;
    }

    public int getDefeatCount() {
        return defeatCount;
    }

    public int getScoredGoalsCount() {
        return scoredGoalsCount;
    }

    public int getReceivedGoalsCount() {
        return receivedGoalsCount;
    }

    public int getPoints() {
        return points;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setWinCount(int i) {
        this.winCount = i;
    }

    public void setDrawCount(int i) {
        this.drawCount = i;
    }

    public void setDefeatCount(int i) {
        this.defeatCount = i;
    }

    public void setScoredGoalsCount(int i) {
        this.scoredGoalsCount = i;
    }

    public void setReceivedGoalsCount(int i) {
        this.receivedGoalsCount = i;
    }

    public void setPoints(int i) {
        this.points = i;
    }

    public void setMatchesPlayed(int i) {
        this.matchesPlayed = i;
    }
}
