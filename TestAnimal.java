package com.Fti.animal;
public class TestAnimal {
    public static void main (String[] args){
        Fish f =  new Fish();
        Cat c = new Cat("Buaya");
        Animal a= new Fish();
        Animal e= new Spider();
//        Pet p = new Cat();
        //Demonstrate different implementations of an interface
        f.play();
        c.play();
        //Demonstract virtual method invocation
        e.eat();
        e.walk();
        //Demonstrate calling super methods
        a.walk();
    }
}
