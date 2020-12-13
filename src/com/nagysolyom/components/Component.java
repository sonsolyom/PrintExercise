package com.nagysolyom.components;

public abstract class Component {

    String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void printElement(){
        System.out.println(this.getName());
    }

}