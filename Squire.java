public class Squire extends player {
    double damage;
    double healthPoint;
    public Squire(String name) {
        super(name);
        this.damage = 0.5; //урон
        this.healthPoint = 5.0; //жизни
    }
}