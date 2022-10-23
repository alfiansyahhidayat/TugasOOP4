package Nusput.P4;

//Program mancari rumus tabung dengan inputan data integer atau double

public class Lingkaran{

    double jari2;
    double luasLingkaran;

    //Overloading Constructor
    Lingkaran(int jari2){
        if(getJari2()%7==0){
            this.luasLingkaran=22*jari2*jari2/7;
        }
        else{
            this.luasLingkaran=3.14*jari2*jari2;
        }
    }
    Lingkaran(double jari2){
        if(getJari2()%7==getJari2()){
            this.luasLingkaran=22*jari2*jari2/7;
        }
        else{
            this.luasLingkaran=3.14*jari2*jari2;
        }
    }

    public double getJari2(){
        return this.jari2;
    }

    
    public void info(){
        System.out.println("Luas lingkaran jari "+getJari2()+" : "+String.format("%.2f %n",this.luasLingkaran));
    }
}

class Tabung extends Lingkaran{
    double tinggi;
    double volume;

    //Overloading Constructor
    Tabung(int jari2,int tinggi){
        super(jari2);
        this.jari2=jari2;
        this.tinggi=tinggi;
        volume=luasLingkaran*tinggi;
    }
    Tabung(int jari2,double tinggi){
        super(jari2);
        this.jari2=jari2;
        this.tinggi=tinggi;
        volume=luasLingkaran*tinggi;
    }
    Tabung(double jari2,int tinggi){
        super(jari2);
        this.jari2=jari2;
        this.tinggi=tinggi;
        volume=luasLingkaran*tinggi;
    }
    Tabung(double jari2,double tinggi){
        super(jari2);
        this.jari2=jari2;
        this.tinggi=tinggi;
        volume=luasLingkaran*tinggi;
    }

    //Overriding method
    @Override
    public void info(){
        super.info();
        System.out.println("Volume Tabung dengan tinggi "+this.tinggi+" : "+String.format("%.2f %n",this.volume));
        System.out.println("");
    }

    public static void main(String[] args) {
        Tabung tabung1= new Tabung(1.4, 9.2);
        Tabung tabung2=new Tabung(14, 5);
        tabung1.info();
        tabung2.info();
    }
}