package day11.task2;

public class Magician extends Hero implements MagicAttack {

    public Magician() {
        this.physAttack = 5;
        this.magicAttack = 20;
        this.physDef = 0;
        this.magicDef = 0.8;
    }
    @Override
    public void magicalAttack(Hero hero) {
        double tempHeal = (hero.getHealth() - (this.magicAttack - (this.magicAttack * hero.getMagicDef())));
        hero.setHealth(tempHeal);
    }

    public String toString(){
        return "Magician{health="+health+"}";
    }
}
