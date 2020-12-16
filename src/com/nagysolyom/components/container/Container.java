package com.nagysolyom.components.container;

import com.nagysolyom.components.Component;

//Define the class which extends another - inherits all its attributes and methods
public class Container extends Component {
    //Instantiate stringBuilders to be able to print out any String
    private StringBuilder startContainerString = new StringBuilder();
    private StringBuilder endContainerString = new StringBuilder();

    //Define HTML style for better visualization
    private String containerStyle = "\"display:flex; flex-wrap:wrap; background-color:coral;\"";

    //Declare constructor
    public Container(){
    }

    //Define method to create the beginning of a simple container
    public void startContainer(){
        startContainerString
                .append("<dir style=")
                .append(containerStyle)
                .append(">");

        System.out.println(startContainerString.toString());

    }

    //Define method to create the ending of a simple container
    public void endContainer(){
        endContainerString.append("</dir>");

        System.out.println(endContainerString.toString());

    }
}
