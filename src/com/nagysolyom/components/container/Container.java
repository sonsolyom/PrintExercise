package com.nagysolyom.components.container;

import com.nagysolyom.components.Component;

public class Container extends Component {

    private String containerStyle = "\"display:flex; flex-wrap:wrap; background-color:coral;\"";

    public Container(){
    }

    public void startContainer(){

        System.out.println("<dir style=" +containerStyle+ ">");

    }

    public void endContainer(){

        System.out.println("</dir>");

    }
}
