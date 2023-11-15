public class Gargantuar extends Character{

    String type = "Plant";
    int braincost = 300;
    int health = 500;
    int damageItCanDo = 50;
    int cooldown = 0;

    public Gargantuar(String name) {
        super(name);
    }

    public void takeDamage(int damageDone){

        this.health -= damageDone;

    }

    public int splashDamage(){

        double min = 0.0;
        double max = 1.0;
        double splashAffect = min + Math.random() * (max - min);
        cooldown++;
        return (int) Math.ceil(this.damageItCanDo * splashAffect);
    }

    public int homingImp(){

        double min = 0.80;
        double max = 1.0;
        double explosionAffect = min + Math.random() * (max - min);
        if (cooldown % 2 == 0){
            cooldown++;
            return (int) Math.ceil(this.damageItCanDo * explosionAffect);
        }
        else {
            System.out.println("Homing Imp cannot be used (One Round Cooldown)");
            return splashDamage();
        }
    }

}
