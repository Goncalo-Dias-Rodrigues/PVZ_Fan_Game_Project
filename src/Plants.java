public class Plants {

    String name;
    int sunCost;
    int health;
    int damageItCanDo;

    public Plants(String name, int sunCost, int health, int damageItCanDo){
        this.name = name;
        this.sunCost = sunCost;
        this.health = health;
        this.damageItCanDo = damageItCanDo;
    }

    public void takeDamage(int damageDone){

        this.health -= damageDone;

    }

}

