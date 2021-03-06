package day11.task2;

public class Paladin extends Hero implements Healer {
private int healValueHimself;
private int healValueTeammate;

    public Paladin() {
        this.health = 100;
        this.physAttack = 15;
        this.physDef = 0.5;
        this.magicDef = 0.2;
        this.healValueHimself = 25;
        this.healValueTeammate = 10;
    }

    @Override
    public void healHimself() {
        if (this.health+this.healValueHimself<100) {
            this.health = this.health + this.healValueHimself;
        }else{
            this.health = 100;

        }
    }

    public void healTeammate(Hero hero) {
        if (hero.getHealth()+this.healValueTeammate<100) {
            double tempHeal = hero.getHealth() + this.healValueTeammate;
            hero.setHealth(tempHeal);
        }else  hero.setHealth(100);
    }

    public String toString(){
        return "Paladin{health="+health+"}";
    }
}
