package com.nagysolyom.components;

//Define an abstract class as we do not want to instantiate itself, only to being extended
public abstract class Component {

    //Declare variable - set it to private as best practice
    private String name;

    //Define setter - with this method we can assign value to the private variable from outside the class
    public void setName(String name){
        this.name = name;
    }

    //Define getter - with this method we can have the private variable value from outside the class
    public String getName() {
        return this.name;
    }

    //Define this method as we would like to print a passed parameter to the console
    public void printElement(){
        System.out.println(this.getName());
    }

}