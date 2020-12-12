package com.nagysolyom.components.visual;

import com.nagysolyom.components.Component;

public class Combo extends Component {

    private String comboData = "I am data";
    private String comboLabel = "Choose a combo:";
    private String comboValueAttr = "combo";
    private String selectStyle = "\"font-style:italic; height:1.5em; margin:auto 0.2em; background-color:dodgerblue; cursor:pointer;\"";

    public Combo() {
        setName("<label for=\"choice\" style=\"margin:auto 0.2em;\">" + comboLabel + "</label>"
                + "\n<select id=\"choice\" style="+selectStyle+">"
                + "\n<option value=\"" + comboValueAttr + "\">" + comboData + "</option>"
                + "\n<option value=\"" + comboValueAttr + "\">" + comboData + "</option>"
                + "\n<option value=\"" + comboValueAttr + "\">" + comboData + "</option>"
                + "\n<option value=\"" + comboValueAttr + "\">" + comboData + "</option>"
                + "\n</select>");
    }

}