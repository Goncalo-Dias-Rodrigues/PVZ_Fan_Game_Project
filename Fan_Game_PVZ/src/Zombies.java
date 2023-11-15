public class Zombies {

    String name;
    int brainCost;
    int health;
    int damageItCanDo;

    public Zombies(String name, int sunCost, int health, int damageItCanDo){
        this.name = name;
        this.brainCost = sunCost;
        this.health = health;
        this.damageItCanDo = damageItCanDo;
    }

    public void takeDamage(int damageDone){

        this.health -= damageDone;

    }
}
