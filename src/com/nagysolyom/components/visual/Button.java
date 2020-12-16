package com.nagysolyom.components.visual;

/*import java.util.Scanner;*/

import com.nagysolyom.components.Component;

//Define the class which extends another - inherits all its attributes and methods
public class Button extends Component {
    //Instantiate a stringBuilder to be able to print out any String
    private StringBuilder stringBuilder = new StringBuilder();

    /*
    * //Instantiate the scanner for the HTML table - we would like to have some user input
    * private Scanner inputButton = new Scanner(System.in);
    */

    //Define HTML style for better visualization
    private String style = "\"margin:1em; border-radius:0.5em; background-color:lime;\"";

    //Define constructor
    public Button() {
        /*
        * //Asks the user for input and assign it to the variable
        * System.out.print("Please enter the content of the 'will be button': ");
        * String inputButtonData = inputButton.nextLine();
        */

    }

    //D
    public void setButtonData(String buttonData){
        stringBuilder
                .append("<button type=\"button\" style=")
                .append(style)
                .append(">").append(buttonData)
                .append("</button>");

        String stringBuilderToString = stringBuilder.toString();
        setName(stringBuilderToString);
    }
}