package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
       this.health = 100;
       this.physAttack = 30;
        this.physDef = 0.8;
        this.magicDef = 0;
    }

    public String toString(){
        return "Warrior{health="+health+"}";
    }
    }
