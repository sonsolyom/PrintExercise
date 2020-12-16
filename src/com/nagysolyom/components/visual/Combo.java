package com.nagysolyom.components.visual;

import com.nagysolyom.components.Component;

//Define the class which extends another - inherits all its attributes and methods
public class Combo extends Component {

    //Instantiate a stringBuilder to be able to print out any String
    private StringBuilder stringBuilder = new StringBuilder();

    //Define HTML attributes and visual data
    private String comboLabel = "Choose a combo:";
    private String comboValueAttr = "combo";
    private String selectStyle = "\"font-style:italic; height:1.5em; margin:auto 0.2em; background-color:dodgerblue; cursor:pointer;\"";

    //Define constructor
    public Combo() {
    }

    //Setter
    public void setCombos(Integer comboNums, String comboData){
        //Utilize the string builder to start create the combo
        stringBuilder
                .append("<label for=\"choice\" style=\"margin:auto 0.2em;\">")
                .append(comboLabel)
                .append("</label>")
                .append("\n")
                .append("<select id=\"choice\" style=")
                .append(selectStyle)
                .append(">")
                .append("\n");

        /* The for loop access the passed integer of the parameter
         *       and runs as many times.
         *       Then the for each loop access an arrayList and concatenate its content.
         */
        for (int i = 0; i < comboNums; i++){
                stringBuilder
                        .append("<option value=\"")
                        .append(comboValueAttr)
                        .append("\">")
                        .append(comboData)
                        .append(" ")
                        .append(i + 1)
                        .append("</option>")
                        .append("\n");

            }
        stringBuilder.append("</select>");

        //Call the extended setter to pass the built String
        setName(stringBuilder.toString());
    }

}