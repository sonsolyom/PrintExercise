package com.nagysolyom.components.visual;

import com.nagysolyom.components.Component;

//Define the class which extends another - inherits all its attributes and methods
public class Combo extends Component {

    private StringBuilder stringBuilder = new StringBuilder();

    //Define HTML attributes and visual data
    private String comboData = "COMBO ";
    private String comboLabel = "Choose a combo:";
    private String comboValueAttr = "combo";
    private String selectStyle = "\"font-style:italic; height:1.5em; margin:auto 0.2em; background-color:dodgerblue; cursor:pointer;\"";

    //Define constructor
    public Combo() {

    }

    public void setCombos(Integer comboNums){
        stringBuilder.append("<label for=\"choice\" style=\"margin:auto 0.2em;\">" + comboLabel + "</label>")
                .append("\n")
                .append("<select id=\"choice\" style=" + selectStyle + ">")
                .append("\n");

        /* The for loop access the passed integer of the parameter
         *       and runs as many times.
         *       Then the for each loop access an arrayList and concatenate its content.
         */
        for (int i = 0; i < comboNums; i++){

                stringBuilder.append("<option value=\"" + comboValueAttr + "\">" + comboData + (i + 1) + "</option>")
                        .append("\n");
            }

        stringBuilder.append("</select>");

        String stringBuilderToString = stringBuilder.toString();

        setName(stringBuilderToString);
    }

}