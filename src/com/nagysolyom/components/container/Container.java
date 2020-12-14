package com.nagysolyom.components.container;

import com.nagysolyom.components.Component;

//Define the class which extends another - inherits all its attributes and methods
public class Container extends Component {

    //Define HTML style for better visualization
    private String containerStyle = "\"display:flex; flex-wrap:wrap; background-color:coral;\"";

    //Declare constructor
    public Container(){
    }

    //Define method to create the beginning of a simple container
    public void startContainer(){

        System.out.println("<dir style=" + containerStyle + ">");

    }

    //Define method to create the ending of a simple container
    public void endContainer(){

        System.out.println("</dir>");

    }
}
