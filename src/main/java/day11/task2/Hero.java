package day11.task2;

public abstract class Hero implements PhysAttack {
    int tempHeal;
    double health;
    int physAttack;
    int magicAttack;
    double physDef;
    double magicDef;

    public Hero() {
        health = 100;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    @Override
    public void physicalAttack(Hero hero) {
        if ((hero.getHealth() - (this.physAttack - (this.physAttack * hero.getPhysDef())))>0) {
            double tempHeal = (hero.getHealth() - (this.physAttack - (this.physAttack * hero.getPhysDef())));
            hero.setHealth(tempHeal);
        }
        else {hero.setHealth(0);
        }
    }
}