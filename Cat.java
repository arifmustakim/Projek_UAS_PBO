package com.Fti.animal;
public class Cat extends Animal implements Pet{
    String name;
    public Cat(String name){
        super(4);
        this.name=name;
    }
    public Cat(){
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
        System.out.println(name+" Pemakan Daging");
    }
    @Override
    public void eat(){
        System.out.println(name+" pemakan Rumput");
    }
}