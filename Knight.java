public class Knight extends player {
    double damage;
    double healthPoint;
    public Knight(String name) {
        super(name);
        this.damage = 2.0; //урон
        this.healthPoint = 15.0; //жизни
    }
}
