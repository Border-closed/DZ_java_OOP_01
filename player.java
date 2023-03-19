public class player {
    long id;
    String name;
    double healthPoint;
    double damage;

    public static Long idCounter = 1L;

    public player (String name) {
        this.name = name;
        id = idCounter;
        idCounter++;
    }
    
    public void attack (Knight Knight, double damage){
        if (Knight.healthPoint>0) {
            Knight.healthPoint=Knight.healthPoint-damage;
            System.out.println("У "+Knight.name+" "+Knight.healthPoint+" жизней");
        } else {
            System.out.println(Knight.name+" мертв");
        }
    }

    public void attack (soldier soldier, double damage){
        if (soldier.healthPoint>0) {
            soldier.healthPoint=soldier.healthPoint-damage;
            System.out.println("У "+soldier.name+" "+soldier.healthPoint+" жизней");
        } else {
            System.out.println(soldier.name+" мертв");
        }
    }

    public void attack (Squire Squire, double damage){
        if (Squire.healthPoint>0) {
            Squire.healthPoint=Squire.healthPoint-damage;
            System.out.println("У "+Squire.name+" "+Squire.healthPoint+" жизней");
        } else {
            System.out.println(Squire.name+" мертв");
        }
    }




}
