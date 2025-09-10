package Java_Fundamentals.Exams.FinalExams.Exam5;

public class City {
    private long population;
    private int gold;

    public City(long population,int gold) {
        this.population=population;
        this.gold=gold;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
