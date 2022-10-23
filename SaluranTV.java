package Nusput.P4;

//Program sederhana untuk menampilkan acara TV

import java.util.ArrayList;

public class SaluranTV {
    private String nama;
    private int tahun;
    private int noAcara;
    public ArrayList<String> saluran =new ArrayList<>();
    public ArrayList<String> acara =new ArrayList<>();

    //Overloading Constructor
    SaluranTV(){
        setSaluran();
    }
    SaluranTV(String nama){
        this.nama=nama;
        setSaluran();
    }
    SaluranTV(String nama,int tahun){
        this.nama=nama;
        this.tahun=tahun;
        setSaluran();
    }
   
    public void setSaluran(){
        this.saluran.add("RCTI");
        this.saluran.add("TransTV");
        this.saluran.add("GlobalTV");
    }
    

    public void tampilkanAcara(int noAcara){
        System.out.println("");
        if(noAcara>0 && noAcara<=saluran.size()){
            System.out.println("Menampilkan saluran no "+noAcara+", saluran "+saluran.get(noAcara-1));
        }
        else{
            System.out.println("Acara no "+noAcara+" NOT FOUND");
            System.out.println("Acara tv hanya ada "+saluran.size());
            System.out.println("Anda bisa melihat daftar acara TV di menu infoSaluranAcara");
        }
              
    }

    public void infoSaluranAcara(){
        System.out.println("");
        System.out.println("Acara TV");
        System.out.println("=============");
        for(int i=0;i<saluran.size();i++){
            System.out.println((i+1)+" "+saluran.get(i));
        }
    }
}

class SaluranTVIndihome extends SaluranTV{

    SaluranTVIndihome(String nama){
        super(nama);
    }
    SaluranTVIndihome(String nama,int tahun){
        super(nama,tahun);
    }
    SaluranTVIndihome(){
        super();
    }

    //Overriding Method
    @Override
    public void setSaluran(){
        super.setSaluran();
        this.saluran.add("Bigbox");
        this.saluran.add("HorrorTV");
    }

    @Override
    public void tampilkanAcara(int noAcara){
        super.tampilkanAcara(noAcara);
    }

    @Override
    public void infoSaluranAcara(){
        System.out.println("");
        System.out.println("Acara TV Indihome");
        super.infoSaluranAcara();
    }


    public static void main(String[] args) {
        SaluranTV samsung=new SaluranTV("Samsung",2001);
        SaluranTVIndihome LG=new SaluranTVIndihome("LED");
        LG.infoSaluranAcara();
        LG.tampilkanAcara(5);
        System.out.println("\n");
        samsung.infoSaluranAcara();
        samsung.tampilkanAcara(4);
    }
}
