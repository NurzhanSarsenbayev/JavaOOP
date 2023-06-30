//        Проанализировать и описать персонажей:
//        Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
//        На базе описания персонажей описать простейшую иерархию классов.
//        В основной программе создать по одному экземпляру каждого класса.
public class units {
    public String name;
    public int health;
    public int defence;
    public int mana;
    public int damage;
    //    public boolean haveMana;
    public int actionPoints;
    public int initiave;

    public units(int health, int defence, int mana, int damage, int actionPoints, String name, int initiave) {
        this.health = health;
        this.defence = defence;
        this.mana = mana;
        this.damage = damage;
        this.actionPoints = actionPoints;
        this.name = name;
        this.initiave = initiave;
    }

    public boolean hasAP(){
        if(actionPoints>0){
            return true;
        }else return false;
    }
}

//0 1 2 3 4 5
