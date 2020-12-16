package com.nagysolyom.components.visual;

/*import java.util.Scanner;*/

import com.nagysolyom.components.Component;

//Define the class which extends another - inherits all its attributes and methods
public class Button extends Component {

    //Instantiate the scanner for the HTML table - we would like to have some user input
    /*private Scanner inputButton = new Scanner(System.in);*/

    //Instantiate the extended class - we would like to use its methods
    private String buttonData;

    //Define HTML style for better visualization
    private String style = "\"margin:1em; border-radius:0.5em; background-color:lime;\"";

    //Define constructor
    public Button() {
        /*
        * //Asks the user for input and assign it to the variable
        * //System.out.print("Please enter the content of the 'will be button': ");
        * // String inputButtonData = inputButton.nextLine();
        *
        * //Call the setter of the extended class and pass the user input to it
        * // buttonData.setName(inputButtonData);
        */

        //Call the setter of this class
        //setButtonData("Im not in main");
        setName("<button type=\"button\" style=" + style + ">" + getButtonData() + "</button>");

        System.out.println(getButtonData());
    }

    public void setButtonData(String buttonData){
        this.buttonData = buttonData;
    }
    public String getButtonData(){
        return buttonData;
    }

}