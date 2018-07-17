package com.Fti.animal;
public class Fish extends Animal implements Pet{
    String name;
    public Fish(String name){
        super(0);
        this.name=name;
    }
    public Fish(){
        this(" ");
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String name){
        this.name=name;
    }
    @Override
    public void play(){
        System.out.println("Kambing Seekor Hewan Pemakan Tumbuh-Tumbuhan");
    }
    @Override
    public void eat(){
        System.out.println("Kuda Tidak Memakan Daging");
    }
    @Override
    public void walk(){
        System.out.println("Dan Kuda, Harimau, Beruang merupakan hewan yang tangguh");
    }
}
