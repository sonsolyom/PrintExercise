package com.nagysolyom.components.container;

import com.nagysolyom.components.Component;
import com.nagysolyom.components.visual.Button;
import com.nagysolyom.components.visual.Combo;
import com.nagysolyom.components.visual.Table;

public class Container extends Component {

    private String containerStyle = "\"display:flex; flex-wrap:wrap; background-color:coral;\"";

    public Container(){
        setName("<dir style=" +containerStyle+ ">"
               +"</dir>");
    }


/*
    public void display(){

        Table table = new Table();
        Button button = new Button();
        Combo combo = new Combo();


        table.printElement();
        button.printElement();
        combo.printElement();


    }
*/
}
