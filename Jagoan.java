
package oop;

public class Jagoan{
private String nama;
    private double health;
    private double attack;

    //Overloading Constructor
    Jagoan(String nama,double health, double attack){
        this.nama=nama;
        this.health=health;
        this.attack=attack;
    }
    Jagoan(String nama){
        this.nama=nama;
        this.health=100;
        this.attack=30;
    }

    public void infoHero(){
        System.out.println("Hero "+getName()+" :\n");
        System.out.println("\tHealth : "+getHealth());
        System.out.println("\tAttack : "+getAttack());
    }
    public String getName(){
        return this.nama;
    }

    public double getHealth(){
        return this.health;
    }

    public double getAttack(){
        return this.attack;
    }

}

class Marksman extends Jagoan{
    private double critDamage=0.4;
    private double finalAttack;
    Marksman(String nama,double health, double attack){
        super(nama, health, attack);
        setFinalAttack();
    }
    Marksman(String nama){
        super(nama);
        setFinalAttack();
    }

    public double getCritDamage(){
        return this.critDamage;
    }
    
    public void setFinalAttack(){
        this.finalAttack=getAttack()+(getAttack()*getCritDamage());
    }

    public double getFinalAttack(){
        return this.finalAttack;
    }
    
    //Overriding Method

    public void infoJagoan(){
        System.out.println("Jagoan"+getName()+" :\n");
        System.out.println("\tHealth : "+getHealth());
        System.out.println("\tAttack : "+getFinalAttack());
    }

    public static void main(String[] args) {
        Marksman miya=new Marksman("miya");
        miya.infoHero();
    }
}
