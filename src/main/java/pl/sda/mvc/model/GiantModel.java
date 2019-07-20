package pl.sda.mvc.model;

public class GiantModel {

    private Health health;
    private Fatigue fatigue;
    private Nourishment nourishment;

    @Override
    public String toString() {
        return "GiantModel{" +
                "health=" + health +
                ", fatigue=" + fatigue +
                ", nourishment=" + nourishment +
                '}';
    }

    public GiantModel(Health health, Fatigue fatigue, Nourishment nourishment) {
        this.health = health;
        this.fatigue = fatigue;
        this.nourishment = nourishment;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public void setFatigue(Fatigue fatigue) {
        this.fatigue = fatigue;
    }

    public void setNourishment(Nourishment nourishment) {
        this.nourishment = nourishment;
    }

    public Health getHealth() {
        return health;
    }

    public Fatigue getFatigue() {
        return fatigue;
    }

    public Nourishment getNourishment() {
        return nourishment;
    }
}
