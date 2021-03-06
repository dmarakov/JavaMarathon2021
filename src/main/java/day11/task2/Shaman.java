package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {
   private int healValueHimself;
    private int healValueTeammate;

    public Shaman() {
        this.health = 100;
        this.physAttack = 10;
        this.magicAttack = 15;
        this.physDef = 0.2;
        this.magicDef = 0.2;
        this.healValueHimself = 50;
        this.healValueTeammate = 30;
    }
    @Override
    public void magicalAttack(Hero hero) {
        double tempHeal = (hero.getHealth() - (this.magicAttack - (this.magicAttack * hero.getMagicDef())));
        hero.setHealth(tempHeal);
        System.out.println(tempHeal);

    }
    @Override
    public void healHimself() {
        if (this.health+this.healValueHimself<100) {
            this.health = this.health + this.healValueHimself;
            System.out.println(this.health);
        }else{
            this.health = 100;
            System.out.println(this.health);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth()+this.healValueTeammate<100) {
            double tempHeal = hero.getHealth() + this.healValueTeammate;
            hero.setHealth(tempHeal);
        }else  hero.setHealth(100);
    }

    public String toString(){
        return "Shaman{health="+health+"}";
    }

}
