public class soldier extends player {
    double damage;
    double healthPoint;
    public soldier(String name) {
        super(name);
        this.damage = 1.2; //урон
        this.healthPoint = 10.0; //жизни
    }
    double decreaseHealthPoint (soldier soldier){
        // player.healthPoint=player.healthPoint-player.damage;
        return soldier.damage;
    }
}
