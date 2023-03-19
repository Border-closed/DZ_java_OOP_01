// 1. Создание класса:
//  + Создать класс Player с полями id (long), name (String), damage (double) healthPoint (hp) (double) 
//  + У класса должен быть конструктор, который принимает только name. 
//  + Идентификатор присваивается автоматически из последовательности (1, 2, ...) 
//  + Придумать несколько классов с разными параметрами жизней и атаки по-умолчанию Player player = new Tank("name");
// 2. Создание метода:
//  - Каждый класс должен уметь "бить" другого Player'а void attack(Player player) -> player1.attack(player2) 
//    Внутри метода игрок, на котором вызван метод уменьшает здоровье игрока, который передан в метод 
// 3. Создание объектов (экземпляров класса)
// 4. Стравить объекты друг с другом


public class play {
    public static void main(String[] args) {
        soldier Soldier1 = new soldier("Albert");
        soldier Soldier2 = new soldier("Lera");
        soldier Soldier3 = new soldier("Sasha");
        soldier Soldier4 = new soldier("Ksu");
        Knight Knight1 = new Knight("Dasha");
        Squire Squire1 = new Squire("Dima");
        Soldier1.attack(Knight1,Soldier1.damage);
        Knight1.attack(Soldier1,Knight1.damage);
        Knight1.attack(Soldier2,Knight1.damage);
        Soldier2.attack(Knight1,Soldier1.damage);
        Squire1.attack(Soldier1,Squire1.damage);
        Soldier1.attack(Squire1,Soldier1.damage);
    }
}